package socketcollection.socketcollection_1;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;

public class Server_I {
    private ServerSocket server;
    Collection<PrintWriter> allOut = new ArrayList<>();

    public Server_I() {
        try {
            System.out.println("正在啟動服務器");
            server = new ServerSocket(9188);
            System.out.println("啟動完畢");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void start() {
        try {
            while (true) {
                System.out.println("正在等待客戶端連接");
                Socket socket = server.accept();
                System.out.println("一個客戶端已連接");
                ClientHandler handler = new ClientHandler(socket);
                Thread t1 = new Thread(handler);
                t1.start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Server_I server_i = new Server_I();
        server_i.start();

    }

    private class ClientHandler implements Runnable {
        private Socket socket;

        public ClientHandler(Socket socket) {
            this.socket = socket;
        }

        @Override
        public void run() {
            PrintWriter pw = null;
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
                        ), true
                );

                synchronized (server) {
                    allOut.add(pw);
                }

                sendMessage("有一個客戶端上線了! 當前在線人數:" + allOut.size() + "人");
                String line;
                while ((line = br.readLine()) != null) {
                    System.out.println(line);
                    sendMessage(line);
                }


            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                synchronized (server) {
                   allOut.remove(pw);
                }
                sendMessage("一個客戶端下線了!當前在線人數:" + allOut.size() + "人");
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
