package file.file_2;

import java.io.File;

public class DeleteDir_II {
    public static void main(String[] args) {
        File file = new File("./demo2/dir");
        if (file.isFile()){
            System.out.println("檔案格式為文件");
        } else if (!file.exists()){
            System.out.println("該目錄不存在");
        } else {
            file.delete();
        }


    }
}
