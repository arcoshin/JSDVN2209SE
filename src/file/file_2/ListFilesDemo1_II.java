package file.file_2;

import java.io.File;

public class ListFilesDemo1_II {
    public static void main(String[] args) {
        File file = new File("./demo2");
        File[] list = file.listFiles();
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i].getName());
        }
    }
}
