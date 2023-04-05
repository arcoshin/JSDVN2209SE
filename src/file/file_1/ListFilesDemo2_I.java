package file.file_1;

import java.io.File;
import java.io.FileFilter;

public class ListFilesDemo2_I {
    public static void main(String[] args) {
        File file = new File("./demo");
        FileFilter FF = new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                String name = pathname.getName();
                return name.contains("collection_0");
            }
        };
        File[] list = file.listFiles(FF);
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i].getName());
        }
    }
}
