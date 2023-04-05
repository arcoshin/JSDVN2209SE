package io.io_1;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class PWDemo_I {
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        PrintWriter pw = new PrintWriter("./demo/pw.txt","UTF-8");
        pw.println("中文輸入");
        pw.println("English");
        pw.println("!@#$%^&*()_+");
        pw.println("123456789");
        pw.close();
    }
}
