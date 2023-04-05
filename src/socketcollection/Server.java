package socketcollection;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/**
 * 聊天室的服務端
 */
public class Server {

    private ServerSocket server;
    /**
     * 準備一個集合，泛型指定為PrintWriter，用於儲存服務器對所有客戶端的輸出流，用於廣播訊息給所有用戶端
     */
    private Collection<PrintWriter> allOut = new ArrayList();

    public Server() {

        /**
         * 實例ServerSocket的同時需要指定要打開的端口
         * 當端口號已被其他程序占用時，再次占用則報錯JVM_BIND
         * 不建議隨意刪除端口，因不確定程序內容，確認內容也很繁瑣
         * 此時建議直接更換Server端口，同時Client也須同步
         */
        try {
            System.out.println("正在啟動服務器端");
            server = new ServerSocket(9188);
            System.out.println("服務器端啟動完畢");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void start() {
        try {
            while (true) {
                System.out.println("等待客戶端連接中...");
                /**
                 * ServerSocket提供的Socket accept方法
                 * 該方法是一種阻塞方法，程序執行該方法時會立即等待
                 * 當一客戶端訪問服務器時，accept方法就能監聽到，然後
                 * 返回一個socket實例
                 * 然後程序才會接著向下運行
                 */
                Socket socket = server.accept();
                System.out.println("有一個客戶端連接了!");
                /**
                 * 啟動一線程來處理當前客戶的交互
                 * 聯通並連接當前客戶端的socket
                 * 並一起傳參給ClientHandler
                 * (使用有參構造方法來傳參)
                 */
                ClientHandler clientHandler = new ClientHandler(socket);
                Thread t = new Thread(clientHandler);
                t.start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public static void main(String[] args) {
        Server server = new Server();
        server.start();
    }

    /**
     * 創建一個內部類，是線程的任務類，與特定客戶端進行交流
     */
    private class ClientHandler implements Runnable {
        private Socket socket;

        public ClientHandler(Socket socket) {
            this.socket = socket;
        }

        @Override
        public void run() {
            PrintWriter pw = null;
            try {
                InputStream in = socket.getInputStream();
                InputStreamReader isr = new InputStreamReader(in, StandardCharsets.UTF_8);
                BufferedReader br = new BufferedReader(isr);

                pw = new PrintWriter(//為了全域調用故提出方法外聲明
                        new BufferedWriter(
                                new OutputStreamWriter(
                                        socket.getOutputStream(), StandardCharsets.UTF_8
                                )
                        ), true);

                synchronized (Server.this) {
                    /**
                     * 將輸出流添加到集合中，是不需要擴容的
                     */
                    allOut.add(pw);
                }
                //size()表示集合的容量
                sendMessage("有一個客戶端上線了!當前在線人數:" + allOut.size());//調用方法廣播


                String line;
                while ((line = br.readLine()) != null) {
                    System.out.println(line);
//                    pw.println(line);
                    sendMessage(line);
                }
            } catch (IOException e) {
                e.printStackTrace();
            } finally {//一定是對應客戶端下線了
                //從allOut數組中將輸出流取出
                synchronized (Server.this) {
                    /**
                     *從allOut集合中，將已下線的客戶端輸出流取出
                     * remove()會根據equals方法將返回值為true的元素進行刪除
                     */
                    allOut.remove(pw);
                }
                sendMessage("有一個用戶下線了!當前線上人數為:" + allOut.size());

                try {
                    socket.close();//服務器端也關流
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        /**
         * 廣播給所有客戶的方法
         */
    }

    private void sendMessage(String message) {
        synchronized (Server.this) {
            /**
             * 使用新循環遍歷allOut集合
             */
            for (PrintWriter pw : allOut) {
                pw.println(message);
            }
        }
    }
}

