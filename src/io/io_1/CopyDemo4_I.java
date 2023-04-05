package io.io_1;

import java.io.*;

public class CopyDemo4_I {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("./demo/copyArea/practice/1.png");
        BufferedInputStream bis = new BufferedInputStream(fis);
        FileOutputStream fos = new FileOutputStream("./demo/copyArea/practice/5.png");
        BufferedOutputStream bos = new BufferedOutputStream(fos);

        int lock;
        long start = System.currentTimeMillis();
        while ((lock = bis.read()) != -1){//
            bos.write(lock);//緩衝流本質就是塊讀塊寫
        }
        bis.close();
        bos.close();
        long end = System.currentTimeMillis();
        System.out.println("共"+(end-start)+"毫秒");
    }
}
