package socketcollection.socketcollection_2;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;

public class Server_II {
    private ServerSocket server;
    private Collection<PrintWriter> allOut = new ArrayList<>();
    public Server_II() {
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
        Server_II server_ii = new Server_II();
        server_ii.start();
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
                    allOut.add(pw);
                }

                sendMessage("有一位玩家上線了，目前在線人數為" + allOut.size() + "人");
                String line;
                while ((line = br.readLine()) != null) {
                    System.out.println(line);//主機打印line實現螢幕顯示
                    sendMessage(line);//每個人的pw寫下line實現對話
                }


            } catch (IOException e) {
                e.printStackTrace();
            } finally {//走到此代碼塊必定是用戶斷開連結了
                synchronized (server) {
                    allOut.remove(pw);
                }

                sendMessage("有一位玩家下線了，目前在線人數為" + allOut.size() + "人");
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }


        }

        private void sendMessage(String message) {
            synchronized (server) {
                for (PrintWriter pw : allOut) {
                    pw.println(message);
                }
            }
        }


    }

}
