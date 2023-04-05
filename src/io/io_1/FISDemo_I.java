package io.io_1;

import java.io.FileInputStream;
import java.io.IOException;

public class FISDemo_I {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("./demo/fos.txt");
        int data;
        while ((data = fis.read()) != -1){
            System.out.print((char)data);
        }
        fis.close();

    }
}
