package io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/**
 * 向文件寫出字符串
 */
public class WriteStringDemo {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("./demo/string.txt");
        String line = "beep,beep,practice'm sheep~beep,beep,practice'm sheep";

        byte[] data = line.getBytes(StandardCharsets.UTF_8);
        fos.write(data);
        fos.write("\r\n逼逼安慕希逼逼安慕希".getBytes(StandardCharsets.UTF_8));
        fos.close();

    }
}
