package socket.practice_2;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class Server_2 {
    private ServerSocket server;
    private PrintWriter[] allOut = {};

    public Server_2() {
        try {
            System.out.println("正在啟動服務器");
            server = new ServerSocket(9188);
            System.out.println("啟動完畢");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void start() {
        try {
            while (true) {
                System.out.println("正待等待用戶端連接");
                Socket socket = server.accept();
                System.out.println("一個用戶端已連接");
                ClientHandler handler = new ClientHandler(socket);
                Thread t1 = new Thread(handler);
                t1.start();

            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        Server_2 server_2 = new Server_2();
        server_2.start();
    }

    private class ClientHandler implements Runnable {
        private Socket socket;
        PrintWriter pw;

        public ClientHandler(Socket socket) {
            this.socket = socket;
        }

        @Override
        public void run() {
            try {
                BufferedReader br = new BufferedReader(
                        new InputStreamReader(
                                socket.getInputStream(), StandardCharsets.UTF_8
                        )
                );

                pw = new PrintWriter(
                        new BufferedWriter(
                                new OutputStreamWriter(
                                        socket.getOutputStream(), StandardCharsets.UTF_8
                                )
                        )
                        , true);

                synchronized (server) {//每個pw在此裝入數組
                    allOut = Arrays.copyOf(allOut, allOut.length + 1);
                    allOut[allOut.length - 1] = pw;
                }

                sendMessage("有一位玩家上線了，目前在線人數為" + allOut.length + "人");
                String line;
                while ((line = br.readLine()) != null) {
                    System.out.println(line);//主機打印line實現螢幕顯示
                    sendMessage(line);//每個人的pw寫下line實現對話
                }


            } catch (IOException e) {
                e.printStackTrace();
            } finally {//走到此代碼塊必定是用戶斷開連結了
                synchronized (server) {
                    for (int i = 0; i < allOut.length; i++) {
                        if (allOut[i] == pw) {//對比自己的pw從列表中刪除(縮容)
                            allOut[i] = allOut[allOut.length - 1];
                            allOut = Arrays.copyOf(allOut, allOut.length - 1);
                            break;
                        }
                    }
                }

                sendMessage("有一位玩家下線了，目前在線人數為" + allOut.length + "人");
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }


        }

        private void sendMessage(String message) {
            synchronized (server) {
                for (int i = 0; i < allOut.length; i++) {
                    allOut[i].println(message);
                }
            }
        }


    }

}
