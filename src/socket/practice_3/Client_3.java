package socket.practice_3;

import java.io.*;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Client_3 {
    private Socket socket;
    private static String name;

    public Client_3() {
        try {
            System.out.println("正在連接服務器......");
            socket = new Socket("localhost", 9188);
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
            ,true);

            Scanner scanner = new Scanner(System.in);
            while (true) {
                String line = scanner.nextLine();
                if (line.equals("EXIT")) {
                    System.out.println("用戶端已退出");
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
        Scanner scanner = new Scanner(System.in);
        name = scanner.nextLine();
        Client_3 client3 = new Client_3();
        client3.start();
    }

    private class ServerHandler implements Runnable {

        @Override
        public void run() {
            try {
                BufferedReader br = new BufferedReader(
                        new InputStreamReader(
                                socket.getInputStream(), StandardCharsets.UTF_8));

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
