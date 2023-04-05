package io.io_2;

import java.io.FileOutputStream;
import java.io.IOException;

public class FOSDemo_II {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("./demo2/fos.txt");
        fos.write(97);
        fos.write(98);
        fos.write(99);
        fos.write(100);
        fos.write(101);
        fos.write(102);
        fos.write(103);
        fos.write(104);

        fos.write("COME".getBytes());
        fos.write("ON!".getBytes());

        fos.close();
        }

}
