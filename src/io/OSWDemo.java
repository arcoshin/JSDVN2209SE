package io;

import java.io.*;
import java.nio.charset.StandardCharsets;

/**
 * OSW OutputStreamWriter 將字節輸出流和字符輸出流進行轉換
 */
public class OSWDemo {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("./demo/osw.txt");
        OutputStreamWriter osw = new OutputStreamWriter(fos,StandardCharsets.UTF_8);
        //fos.write("寧願胖的精緻，不願瘦的雷同".getBytes(StandardCharsets.UTF_8));
        osw.write("寧願胖的精緻，不願瘦的雷同\r\n");
        osw.write("雖然認輸不會死，但是死也不認輸\r\n");
        osw.write("美醜由命，胖瘦在天\r\n");
        osw.write("精忠報國\r\n");
        osw.close();
    }
}
