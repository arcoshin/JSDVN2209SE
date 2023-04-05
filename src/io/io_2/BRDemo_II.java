package io.io_2;

import java.io.*;

public class BRDemo_II {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(
                new InputStreamReader(
                        new FileInputStream("./demo2/pwNote.txt")
                )
        );

        int data;
        while ((data = br.read()) != -1){
            System.out.print((char) data);
        }
        br.close();


    }
}
