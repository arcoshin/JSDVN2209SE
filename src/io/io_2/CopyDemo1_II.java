package io.io_2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyDemo1_II {
    public static void main(String[] args) throws IOException {

        FileOutputStream fos = new FileOutputStream("./demo2/2.png");
        FileInputStream fis = new FileInputStream("./demo2/1.png");

        long start = System.currentTimeMillis();
        int data;
        while ((data = fis.read()) != -1) {
            fos.write(data);
        }

        fis.close();
        fos.close();
        long end = System.currentTimeMillis();
        System.out.println(end - start);//1540

    }
}
