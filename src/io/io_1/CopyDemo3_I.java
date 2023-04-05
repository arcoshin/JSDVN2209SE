package io.io_1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyDemo3_I {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("./demo/copyArea/practice/1.png");
        FileOutputStream fos = new FileOutputStream("./demo/copyArea/practice/4.png");

        byte[] data = new byte[10240];
        int lock;
        long start = System.currentTimeMillis();
        while ((lock = fis.read(data)) != -1){//
            fos.write(data,0,lock);//實現讀多少寫多少，修正放大問題
        }
        fis.close();
        fos.close();
        long end = System.currentTimeMillis();
        System.out.println("共"+(end-start)+"毫秒");
    }
}
