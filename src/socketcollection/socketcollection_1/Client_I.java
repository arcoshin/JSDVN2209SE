package socketcollection.socketcollection_1;

import java.io.*;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Client_I {
    private Socket socket;
    private static String name;

    public Client_I() {
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
            //创建一个输出转换流,指定编码
            OutputStreamWriter osw = new OutputStreamWriter(out, StandardCharsets.UTF_8);
            //创建一个缓冲字符输出流
            BufferedWriter bw = new BufferedWriter(osw);
            //创建一个按行输出的字符流,并且开启自动行刷新(输出每一行字符串之后,会自动调用flush方法)
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
        Client_I client_i = new Client_I();
        client_i.start();


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


