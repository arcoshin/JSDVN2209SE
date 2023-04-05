package socket.practice_3;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class Server_3 {
    private ServerSocket server;
    private PrintWriter[] allOut = {};

    public Server_3() {
        try {
            System.out.println("正在啟動服務器");
            server = new ServerSocket(9188);
            System.out.println("服務器啟動完畢");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void start() {
        while (true) {
            try {
                System.out.println("等待客戶端連接");
                Socket socket = server.accept();
                System.out.println("一個客戶端已連接");
                ClientHandler handler = new ClientHandler(socket);
                Thread t = new Thread(handler);
                t.start();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    public static void main(String[] args) {
        Server_3 server3 = new Server_3();
        server3.start();
    }

    private class ClientHandler implements Runnable {

        PrintWriter pw = null;
        private Socket socket;

        public ClientHandler(Socket socket) {
            this.socket = socket;
        }

        @Override
        public void run() {
            try {
                BufferedReader br = new BufferedReader(
                        new InputStreamReader(
                                socket.getInputStream(), StandardCharsets.UTF_8)
                );


                pw = new PrintWriter(
                        new BufferedWriter(
                                new OutputStreamWriter(
                                        socket.getOutputStream(), StandardCharsets.UTF_8
                                )
                        )
                        , true);

                synchronized (server) {
                    allOut = Arrays.copyOf(allOut, allOut.length + 1);
                    allOut[allOut.length - 1] = pw;
                }

                sendMessage("有一個客戶端上線了，目前在線人數" + allOut.length + "人");

                String line;
                while ((line = br.readLine()) != null) {
                    System.out.println(line);
                    sendMessage(line);
                }


            } catch (IOException e) {
                e.printStackTrace();

            } finally {

                synchronized (server) {
                    for (int i = 0; i < allOut.length; i++) {
                        if (allOut[i] == pw) {
                            allOut[i] = allOut[allOut.length - 1];
                            allOut = Arrays.copyOf(allOut, allOut.length - 1);
                            break;
                        }
                    }
                }
                sendMessage("有一位客戶端下線了，目前在線人數" + allOut.length + "人");
                try {
                    socket.close();
                } catch (IOException e) {

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
