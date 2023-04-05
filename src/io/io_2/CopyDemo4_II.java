package io.io_2;

import java.io.*;

public class CopyDemo4_II {
    public static void main(String[] args) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(
                new FileInputStream("./demo2/1.png")
        );
        BufferedOutputStream bos = new BufferedOutputStream(
                new FileOutputStream("./demo2/5.png")
        );

        long start = System.currentTimeMillis();

        int data;
        while ((data = bis.read()) != -1){
            bos.write(data);
        }

        bis.close();
        bos.close();

        long end = System.currentTimeMillis();
        System.out.println(end - start);


    }
}
