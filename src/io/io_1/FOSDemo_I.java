package io.io_1;

import java.io.FileOutputStream;
import java.io.IOException;

public class FOSDemo_I {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("./demo/fos.txt",true);
        fos.write("你好".getBytes());
        fos.write("2022".getBytes());
        fos.write("HelloWorld".getBytes());
        fos.write("我是\r\n換行符".getBytes());
        fos.write("1".getBytes());
        fos.write("2".getBytes());
        fos.write("3".getBytes());
        fos.write("4".getBytes());
        fos.write("5".getBytes());
        fos.write("6".getBytes());
        fos.write("7".getBytes());
        fos.write("8".getBytes());
        fos.write("9".getBytes());
        fos.write("a".getBytes());
        fos.write("b".getBytes());
        fos.write("c".getBytes());
        fos.write("d".getBytes());
        fos.write("e".getBytes());
        fos.write("f".getBytes());

        fos.close();



    }
}
