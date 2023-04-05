package io.io_1;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class WriteStringDemo_I {
    public static void main(String[] args) throws IOException {
        File file = new File("./demo/string.txt");
        FileOutputStream fos = new FileOutputStream(file);

        String line = "喝完大酒撐條船，說今生不靠岸，去天涯海角浪個遍，失意當嘗鮮\r\n";
        byte[] data = line.getBytes(StandardCharsets.UTF_8);
        fos.write(data);
        fos.write("捻杯酒，瞇著眼，說專心看人間".getBytes(StandardCharsets.UTF_8));
        fos.close();





    }
}
