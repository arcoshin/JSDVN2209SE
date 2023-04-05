package io.io_1;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class ReadStringDemo_I {
    public static void main(String[] args) throws IOException {
        File file = new File("./demo/string.txt");
        FileInputStream fis = new FileInputStream(file);
        byte[] data = new byte[fis.available()];
        fis.read(data);
        String line = new String(data, StandardCharsets.UTF_8);
        System.out.println(line);
        fis.close();

    }
}
