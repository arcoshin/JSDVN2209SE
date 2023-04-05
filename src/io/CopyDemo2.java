package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 提供每次讀取寫的數據量，減少實際讀寫的次數，提高讀寫效率
 */
public class CopyDemo2 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("./demo/1.png");
        FileOutputStream fos = new FileOutputStream("./demo/3.png");
        //準備一個data數組進行快讀
        /**
         * 二進制中由0和1組合，其中的1跟0稱為1bit(比特)
         * 00000000 八位二進制組合的內容稱為1Byte(字節)
         * 1 byte = 8bit
         * 1 KB   = 1024 byte
         * 1 MB   = 1024 KB
         * 1 GB   = 1024 MB
         * 1 TB   = 1024 GB
         */

        byte[] data = new byte[10240];//快讀10KB
        int len;
        long start = System.currentTimeMillis();
        while ((len = fis.read(data)) != -1){
            fos.write(data);
        }
        long end = System.currentTimeMillis();
        System.out.println("文件複製完畢");
        System.out.println("共耗時" + (end - start) + "毫秒");
        fis.close();
        fos.close();
    }
}
