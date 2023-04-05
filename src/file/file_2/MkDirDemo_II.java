package file.file_2;

import java.io.File;

public class MkDirDemo_II {
    public static void main(String[] args) {


        File file = new File("./demo2/dir");
        if (file.isFile()) {
            System.out.println("格式為文件檔");
        } else if (file.exists()) {
            System.out.println("該目錄已存在");
        } else {
            file.mkdir();
            System.out.println("目錄已經創建完成");
        }
    }
}
