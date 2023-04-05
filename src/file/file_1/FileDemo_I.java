package file.file_1;

import java.io.File;

public class FileDemo_I {
    public static void main(String[] args) {
        File file = new File("./demo/hello.txt");
        System.out.println(file.getName());
        System.out.println(file.length());
    }
}
