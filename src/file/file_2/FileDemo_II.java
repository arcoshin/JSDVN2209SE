package file.file_2;

import java.io.File;

public class FileDemo_II {
    public static void main(String[] args) {
        File file = new File("./demo2/hello.txt");
        System.out.println(file.getName());
        System.out.println(file.length());
    }
}
