package io.io_2;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class ReadStringDemo_II {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("./demo2/string.txt");
        byte[] data = new byte[fis.available()];
        fis.read(data);
        String str = new String(data, StandardCharsets.UTF_8);
        System.out.println(str);
        fis.close();

    }
}
