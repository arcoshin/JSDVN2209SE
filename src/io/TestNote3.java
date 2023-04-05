package io;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/**
 * 使用緩衝流BufferedWriter實現簡易記事本工具
 * 啟動程序，通過不斷在控制台輸入內容
 * 寫入綁定文件中
 */
public class TestNote3 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("請輸入內容，若單獨輸入exit，則退出記事本內容");
        System.out.println("你輸入你要寫入的文件");
        String filePath = scanner.nextLine();

        File file = new File("./demo");
        File file1 = new File(file, filePath);

        FileOutputStream fos = new FileOutputStream(file1, true);
        OutputStreamWriter osw = new OutputStreamWriter(fos, StandardCharsets.UTF_8);
        BufferedWriter bw = new BufferedWriter(osw);
        PrintWriter pw = new PrintWriter(bw,true);
        //autoFlush 表示自動行刷新，不用等關流即自動刷新，關流功能內建
        System.out.println("請輸入要寫入的內容");
        while (true) {
            String line = scanner.nextLine();
            if ("exit".equals(line)) {
                break;
            }
            pw.println(line);
        }
        System.out.println("寫入完畢");
        pw.close();

    }
}
