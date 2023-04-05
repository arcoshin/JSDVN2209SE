package io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/**
 * 實現簡易記事本工具
 * 啟動程序，通過不斷在控制台輸入內容
 * 寫入綁定文件中
 */
public class TestNote1 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("請輸入你要寫入的文件");
        String filePath = scanner.nextLine();
        File file = new File("./demo");
        /**
         * File(File parent,String path)
         * 會自動去parent目錄下，定位指定的path資源
         */
        file = new File(file,filePath);
        FileOutputStream fos = new FileOutputStream(file);
        System.out.println("請輸入您要寫入的內容");
        while (true){
            String line = scanner.nextLine();
            if ("exit".equals(line)){
                break;
            }
            fos.write(line.getBytes(StandardCharsets.UTF_8));
        }
        System.out.println("寫入完畢");
        fos.close();
    }
}
