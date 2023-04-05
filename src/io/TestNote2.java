package io;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/**
 * 實現簡易記事本工具
 * 啟動程序，通過不斷在控制台輸入內容
 * 寫入綁定文件中
 */
public class TestNote2 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("請輸入內容，若單獨輸入exit，則退出記事本內容");
        System.out.println("你輸入你要寫入的文件");
        String filePath = scanner.nextLine();
        File file = new File("./demo");
        /**
         * File(File parent,String path)
         * 會自動去parent目錄下，定位指定的path資源
         */
        File file1 = new File(file, filePath);
        /** 文件流有兩種創建方式: 覆蓋模式 及 追加模式
         *  覆蓋模式: 每次寫入內容，會先清空原有內容再寫入
         *  追加模式: 不會清空原有內容，而是在原有內容的基礎上進行寫入。
         *  FileOutputStream(File file, boolean append)
         *  FileOutputStream(String path, boolean append)
         *  如果在創入構造方法時，傳入第二個參數為true時，就會開啟追加模式
         */
        FileOutputStream fos = new FileOutputStream(file1, true);
        System.out.println("請輸入要寫入的內容");
        while (true) {
            String line = scanner.nextLine();
            if ("exit".equals(line)) {
                break;
            }
            fos.write(line.getBytes(StandardCharsets.UTF_8));
        }
        System.out.println("寫入完畢");
        fos.close();

    }
}
