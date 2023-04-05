package io;

import java.io.*;

/**
 * BR BufferedWriter 緩衝字符輸入流
 */
public class BRDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("./demo/pwnote.txt");
        InputStreamReader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);
        /**
         * String readline()
         * 該方法會連續讀取若干字符，直到換行符為止
         * 然後將換行符之前的內容以字符串形式返回
         * 如果單獨讀取了空行，那麼返回一個空字符串
         * 如果到了文件末尾，返回null
         */
        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
        br.close();
    }
}
