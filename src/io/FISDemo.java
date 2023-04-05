package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * FIS FileInputStream
 * 通過該流，可以將文件的字節數據讀取到內存中
 */
public class FISDemo {
    public static void main(String[] args) throws IOException {
        //1.創建文件字節輸入流，並綁定當前項目下demo目錄中的fos.txt文件
        FileInputStream in = new FileInputStream("./demo/fos.txt");
        //2.使用read方法，可以讀取文件中的一個字節
        /**
         * int read 記得強轉
         * 通過強轉char類型可以還原依次字符
         * 多次調用，依次調取字節碼
         * 持續到字尾時會返回"-1"
         * 不知道次數的循環建議用while循環
         */
        System.out.println((char) in.read());
        System.out.println((char) in.read());
        System.out.println((char) in.read());
        System.out.println((char) in.read());
        System.out.println((char) in.read());
        int data;
        while ((data = in.read()) != -1){
            System.out.print((char) data);
        }
        in.close();//會發現輸出結果不如預期，因為會有部分輸出結果用於判別式
        //解決辦法:使用變量鎖定，使判別式中與輸出的變量為同一個
    }
}