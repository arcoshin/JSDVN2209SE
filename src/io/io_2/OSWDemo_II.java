package io.io_2;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;

public class OSWDemo_II {
    public static void main(String[] args) throws IOException {
        OutputStreamWriter osw = new OutputStreamWriter(
                new FileOutputStream("./demo2/osw.txt"),StandardCharsets.UTF_8
        );
        osw.write("寧願胖的精緻，不願瘦的雷同\r\n");
        osw.write("雖然認輸不會死，但是死也不認輸\r\n");
        osw.write("美醜由命，胖瘦在天\r\n");
        osw.write("精忠報國\r\n");
        osw.close();
    }
}
