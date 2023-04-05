package file.file_2;

import java.io.File;

public class DeleteDirs_II {
    private static void diGui(File file) {
        file.delete();
        if (file.exists()){
            File[] list = file.listFiles();
            for (int i = 0; i < list.length; i++) {
                list[i].delete();
                diGui(list[i]);
                diGui(file);
            }
        }

    }

    public static void main(String[] args) {
        File file = new File("./demo2/dirs");
        diGui(file);
    }
}
