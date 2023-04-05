package file.file_1;

import java.io.File;

public class ListFilesDemo1_I {
    public static void main(String[] args) {
        File file = new File("./demo");
        if (file.isFile()) {
            System.out.println(file.getName());
        } else if (file.isDirectory()) {
            File[] list = file.listFiles();
            for (int i = 0; i < list.length; i++) {
                System.out.println(list[i].getName());
            }
            System.out.println("共有" + list.length + "個檔案");
            System.out.println("清單已完成");
        }
    }
}
