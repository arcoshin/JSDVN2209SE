package io.io_2;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class ISRDemo_II {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(
                new FileInputStream("./demo2/pwNote.txt")
        );

        int data;
        while ((data = isr.read()) != -1) {
            System.out.print((char) data);
        }
        isr.close();

    }
}
