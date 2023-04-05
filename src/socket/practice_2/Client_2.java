package socket.practice_2;

import java.io.*;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Client_2 {
    private Socket socket;
    private static String name;

    public Client_2() {
        try {
            System.out.println("正在連接伺服器");
            socket = new Socket("127.0.0.1", 9188);
            System.out.println("伺服器連接完成");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void start() {
        ServerHandler handler = new ServerHandler();
        Thread t1 = new Thread(handler);
        t1.setDaemon(true);
        t1.start();

        try {
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
                if ("exit".equals(line)) {
                    System.out.println("客戶端已退出");
                    break;
                }
                pw.println(name + ">>>" + line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public static void main(String[] args) {
        System.out.println("請輸入名稱");
        Scanner scanner = new Scanner(System.in);
        name = scanner.nextLine();//注意程序順序
        Client_2 client_2 = new Client_2();
        client_2.start();


    }

    private class ServerHandler implements Runnable {

        public ServerHandler() {

        }

        @Override
        public void run() {
            try {
                BufferedReader br = new BufferedReader(
                        new InputStreamReader(
                                socket.getInputStream(), StandardCharsets.UTF_8
                        )
                );


                String data;
                while ((data = br.readLine()) != null) {
                    System.out.println(data);
                }


            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


}
