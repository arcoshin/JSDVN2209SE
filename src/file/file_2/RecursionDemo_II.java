package file.file_2;

import java.io.File;

public class RecursionDemo_II {
    private static void diGui(File file) {
        if (file.isFile()) {
            file.getName();
        } else if (file.isDirectory()) {
            File[] list = file.listFiles();
            for (int i = 0; i < list.length; i++) {
                System.out.println(list[i].getName());
                diGui(list[i]);
            }
        }
    }

    public static void main(String[] args) {
        File file = new File("./demo2/dirs");
        diGui(file);
    }
}
