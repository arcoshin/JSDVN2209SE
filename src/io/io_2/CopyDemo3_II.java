package io.io_2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyDemo3_II {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("./demo2/1.png");
        FileOutputStream fos = new FileOutputStream("./demo2/4.png");

        long start = System.currentTimeMillis();

        byte[] data = new byte[10240];
        int len;
        while ((len = fis.read(data)) != -1){
            fos.write(data,0,len);//起始下標+長度
        }

        fis.close();
        fos.close();

        long end = System.currentTimeMillis();
        System.out.println(end - start);


    }
}
