package socket.practice_4;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class Server_4 {
    private ServerSocket server;
    private PrintWriter[] allOut = {};

    public Server_4() {
        try {
            System.out.println("Opening");
            server = new ServerSocket(9188);
            System.out.println("open ...OK");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void start() {
        while (true) {//容易忘記，造成第二使用者無法發言
            try {
                System.out.println("WaitingForClientJoin");
                Socket socket = server.accept();
                System.out.println("HaveLinked");
                ClientHandler handler = new ClientHandler(socket);
                new Thread(handler).start();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Server_4 server_4 = new Server_4();
        server_4.start();
    }

    private class ClientHandler implements Runnable {
        private Socket socket;
        PrintWriter pw = null;

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
                                        socket.getOutputStream(), StandardCharsets.UTF_8)
                        )
                        , true);

                synchronized (server) {
                    allOut = Arrays.copyOf(allOut, allOut.length + 1);
                    allOut[allOut.length - 1] = pw;
                }

                sendMessage("User In,now" + allOut.length + "people here");

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

                sendMessage("User out,now" + allOut.length + "people here");
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }


        }

        private void sendMessage(String Message) {
            synchronized (server) {
                for (PrintWriter pw : allOut) {
                    pw.println(Message);
                }
            }
        }
    }
}
