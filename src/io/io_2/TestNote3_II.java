package io.io_2;

import java.io.*;
import java.util.Scanner;

public class TestNote3_II {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("請輸入文件名稱");
        File file = new File("./demo2");
        String filename = scanner.nextLine();
        file = new File(file, filename);

        PrintWriter pw = new PrintWriter(
                new OutputStreamWriter(
                        new FileOutputStream(file)
                )
        );
        System.out.println("請輸入要寫入的內容，結束時請輸入exit");
        while (true) {
            String line = scanner.nextLine();
            if (line.equals("exit")) {
                System.out.println("寫入已結束");
                break;
            }
            pw.println(line);
        }
        pw.close();


    }
}
