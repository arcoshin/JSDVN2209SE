package io.io_2;

import java.io.FileInputStream;
import java.io.IOException;

public class FISDemo_II {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("./demo2/fos.txt");
        int data;
        while ((data = fis.read()) != -1){
            System.out.println((char) data);
        }
        fis.close();

    }
}
