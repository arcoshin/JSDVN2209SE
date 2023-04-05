package io.io_2;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class WriteStringDemo_II {
    public static void main(String[] args) throws IOException {

        String line = "喝完大酒撐條船，說今生不靠岸，去天涯海角浪個遍，失意當嘗鮮\r\n";
        FileOutputStream fos = new FileOutputStream("./demo2/string.txt");
        byte[] data = line.getBytes(StandardCharsets.UTF_8);
        fos.write(data);
        fos.write("竹馬去尋竹馬，青梅意興闌珊".getBytes(StandardCharsets.UTF_8));
        fos.close();

    }
}
