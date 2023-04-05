package io;

import java.io.*;

/**
 * ISR InputStreamReader 將字節輸出流與字符輸出流進行轉換
 */
public class ISRDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("./demo/osw.txt");
        //System.out.println((char)fis.read());//只會拿到一個字節，但中文屬於2~3個字節
        InputStreamReader isr = new InputStreamReader(fis);
        int data;
        while ((data = isr.read()) != -1){
            System.out.print((char)data);
        }
        isr.close();


    }
}
