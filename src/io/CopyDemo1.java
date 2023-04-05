package io;

import java.io.*;

/**
 * 實現文件單字節複製
 */
public class CopyDemo1 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("./demo/1.png");
        FileOutputStream fos = new FileOutputStream("./demo/2.png");
        int data;
        System.out.println("開始複製文件");
        long start = System.currentTimeMillis();//打樁語句
        while ((data = fis.read()) != -1) {
            fos.write(data);
        }
        long end = System.currentTimeMillis();
        System.out.println("文件複製完畢");
        System.out.println("共耗時:" + (end - start) + "毫秒");
        fis.close();
        fos.close();
    }
}
