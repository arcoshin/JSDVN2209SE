package file.file_1;

import java.io.File;

public class RecursionDemo_I {
    private static void diGuiFolder(File file) {
        if (file.isFile()) {
            System.out.println("文件檔無法實現遞規方法");
            file.getName();
        } else if (file.isDirectory()) {
            File[] list = file.listFiles();
            for (int i = 0; i < list.length; i++) {
                System.out.println(list[i]);
                diGuiFolder(list[i]);
            }
        }
    }


    public static void main(String[] args) {
        File file = new File("./demo/dirs");
        diGuiFolder(file);
    }
}
