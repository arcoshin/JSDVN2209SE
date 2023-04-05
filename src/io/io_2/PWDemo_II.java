package io.io_2;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class PWDemo_II {
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        PrintWriter pw = new PrintWriter("./demo2/pwNote.txt","UTF-8");
        pw.println("活魚逆流而上");
        pw.println("鹹魚隨波逐流");
        pw.close();

    }
}
