package io.io_1;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FlushDemo_I {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("./demo/flush.txt");
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        bos.write("有情人終成眷屬，有錢人終成痛苦".getBytes());
        System.out.println("寫入完畢");
        bos.flush();

    }
}
