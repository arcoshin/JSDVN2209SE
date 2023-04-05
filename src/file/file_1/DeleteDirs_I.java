package file.file_1;

import java.io.File;

public class DeleteDirs_I {
    public static void main(String[] args) {
        File file = new File("./demo/dirs");
        delDirs(file);
        System.out.println("執行完畢");
    }

    public static void delDirs(File file) {
        file.delete();
        if (file.exists()) {
            File[] list = file.listFiles();
            for (int i = 0; i < list.length; i++) {
                delDirs(list[i]);
                delDirs(file);
            }
        }
    }
}
