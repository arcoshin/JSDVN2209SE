package socket.practice_4;

import java.io.*;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Client_4 {
    private Socket socket;
    private static String name;

    public Client_4() {
        try {
            System.out.println("Linking");
            socket = new Socket("localhost", 9188);
            System.out.println("Link...OK");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void start() {
        try {
            ServerHandler handler = new ServerHandler();
            Thread t = new Thread(handler);
            t.setDaemon(true);
            t.start();

            PrintWriter pw = new PrintWriter(
                    new BufferedWriter(
                            new OutputStreamWriter(
                                    socket.getOutputStream(), StandardCharsets.UTF_8
                            )
                    )
                    , true);

            Scanner scanner = new Scanner(System.in);
            while (true) {
                String line = scanner.nextLine();
                if (line.equals("EXIT")) {
                    System.out.println("User has Left");
                    break;
                }
                pw.println(name + ">>>" + line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("name?");
        name = new Scanner(System.in).nextLine();
        Client_4 client_4 = new Client_4();
        client_4.start();
    }

    private class ServerHandler implements Runnable {

        @Override
        public void run() {
            try {
                BufferedReader br = new BufferedReader(
                        new InputStreamReader(
                                socket.getInputStream(),StandardCharsets.UTF_8
                        )
                );

                String line;
                while ((line = br.readLine()) != null) {
                    System.out.println(line);
                }



            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
