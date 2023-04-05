package io.io_1;

import java.io.*;

public class CopyDemo1_I {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("./demo/copyArea/practice/1.png");
        FileOutputStream fos = new FileOutputStream("./demo/copyArea/practice/2.png");
        int data;
        long start = System.currentTimeMillis();
        while ((data = fis.read()) != -1){
            fos.write(data);
        }
        fis.close();
        fos.close();
        long end = System.currentTimeMillis();
        System.out.println("共"+(end-start)+"毫秒");
    }
}
