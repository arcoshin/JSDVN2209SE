package file.file_1;

import java.io.File;

public class MkDirDemo_I {
    public static void main(String[] args) {
        File file = new File("./demo/dir");
        if (file.exists()) {
            System.out.println("目錄已經存在");
        } else {
            file.mkdir();
            System.out.println("目錄創建完成");
        }

    }
}
