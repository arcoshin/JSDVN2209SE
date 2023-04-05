package io.io_1;

import java.io.*;
import java.util.Scanner;

public class TestNote3_I {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("請輸入要寫入的文件");
        String path = scanner.nextLine();
        File file = new File("./demo");

        file = new File(file, path);
        FileOutputStream fos = new FileOutputStream(file,true);//true開啟追加模式
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        OutputStreamWriter osw = new OutputStreamWriter(bos);
        PrintWriter pw = new PrintWriter(osw,true);//true自動刷新，不用受制於關流

        System.out.println("請輸入要寫入的內容");
        while (true) {
            String line = scanner.nextLine();
            if (line.equals("exit")) {
                break;
            }
            pw.println(line);
        }
        pw.close();
    }
}
