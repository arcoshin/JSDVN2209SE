package io.io_1;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;

public class OSWDemo_I {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("./demo/osw.txt");
        OutputStreamWriter osw = new OutputStreamWriter(fos,StandardCharsets.UTF_8);
        osw.write("努力不一定會成功，但是不努力很爽\r\n");
        osw.write("寧願胖的精緻，不願瘦的雷同\r\n");
        osw.write("雖然認輸不會死，但是死也不認輸\r\n");
        osw.write("美醜由命，胖瘦在天\r\n");
        osw.write("精忠報國\r\n");
        osw.write("English");
        osw.write("!@#$%^&*()_+");
        osw.write("good thing");
        osw.close();



    }
}
