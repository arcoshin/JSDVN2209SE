package file.file_2;

import java.io.File;
import java.io.FileFilter;

public class ListFilesDemo2_II {
    public static void main(String[] args) {
        File file = new File("./demo2");
        FileFilter f1 = new FileFilter(){
            @Override
            public boolean accept(File pathname) {
                String line = pathname.getName();
                return line.contains("collection_0");
            }
        };

        File[] list = file.listFiles(f1);
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i].getName());
        }


    }
}
