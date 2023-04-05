package io.io_2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyDemo2_II {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("./demo2/1.png");
        FileOutputStream fos = new FileOutputStream("./demo2/3.png");

        long start = System.currentTimeMillis();

        byte[] data = new byte[10240];
        int len;
        while ((len = fis.read(data)) != -1){
            fos.write(data);
        }

        fis.close();
        fos.close();

        long end = System.currentTimeMillis();
        System.out.println(end - start);


    }
}
