package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/**
 * 從文件中讀取字符串
 */
public class ReadStringDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("./demo/string.txt");
        byte[] data = new byte[fis.available()];//available();直接獲得預估綁定文件長度
        fis.read(data);
        String str = new String(data, StandardCharsets.UTF_8);
        System.out.println(str);
        fis.close();

    }
}
