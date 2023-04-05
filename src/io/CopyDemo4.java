package io;

import java.io.*;

/**
 * 使用高級流中的緩衝流實現文件複製
 */
public class CopyDemo4 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("./demo/1.png");
        BufferedInputStream bis = new BufferedInputStream(fis);
        FileOutputStream fos = new FileOutputStream("./demo/5.png");
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        int data;
        System.out.println("開始複製文件");
        long start = System.currentTimeMillis();//打樁語句
        while ((data = bis.read()) != -1) {
            bos.write(data);
        }
        long end = System.currentTimeMillis();
        System.out.println("文件複製完畢");
        System.out.println("共耗時:" + (end - start) + "毫秒");
        bis.close();//關閉高級流bis會自動連帶關閉低級流fis
        bos.close();//關閉高級流bos會自動連帶關閉低級流fos
    }
}
