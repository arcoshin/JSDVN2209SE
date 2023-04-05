package io.io_2;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class FlushDemo_II {
    public static void main(String[] args) throws IOException {
        BufferedOutputStream bos = new BufferedOutputStream(
                new FileOutputStream("./demo2/flush.txt")
        );

        bos.write("有情人終成眷屬，有錢人終成痛苦".getBytes(StandardCharsets.UTF_8));
        bos.flush();//取代關流

    }
}
