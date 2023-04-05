package io.io_1;


import java.io.*;

public class BRDemo_I {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("./demo/pwnote.txt");
        InputStreamReader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);
        String line;
        while ((line = br.readLine()) != null){
            System.out.println(line);
        }
        br.close();


    }
}
