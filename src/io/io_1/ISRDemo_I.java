package io.io_1;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class ISRDemo_I {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("./demo/osw.txt");
        InputStreamReader isr = new InputStreamReader(fis);
        int line;
        while ((line = isr.read()) != -1) {
            System.out.print((char) line);
        }
        isr.close();
    }
}
