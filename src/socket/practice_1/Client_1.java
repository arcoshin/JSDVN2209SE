package socket.practice_1;

import java.io.*;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Client_1 {
    private Socket socket;
    private static String name;

    public Client_1() {
        try {
            System.out.println("與伺服器連接中");
            socket = new Socket("127.0.0.1", 9188);
            System.out.println("已連接完成");
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

            OutputStream out = socket.getOutputStream();
            //創建輸出轉換流
            OutputStreamWriter osw = new OutputStreamWriter(out, StandardCharsets.UTF_8);
            //創建緩衝字符流
            BufferedWriter bw = new BufferedWriter(osw);
            //創建按行輸出字符流，並開啟自動行刷新
            PrintWriter pw = new PrintWriter(bw, true);

            Scanner scanner = new Scanner(System.in);
            while (true) {
                String line = scanner.nextLine();
                if ("exit".equals(line)) {
                    System.out.println("客戶端已退出");
                    break;
                }
                pw.println(name + line);
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
        System.out.println("請輸入用戶名");
        name = new Scanner(System.in).nextLine();
        Client_1 client_1 = new Client_1();
        client_1.start();


    }

    private class ServerHandler implements Runnable {

        @Override
        public void run() {
            try {
                BufferedReader br = new BufferedReader(
                        new InputStreamReader(socket.getInputStream(), StandardCharsets.UTF_8)
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


