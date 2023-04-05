package file.file_2;

import java.io.File;

public class DeleteFile_II {
    public static void main(String[] args) {
        File file = new File("./demo2/hello.txt");
        if (file.isFile() && file.exists()){
            file.delete();
            System.out.println("文件刪除完成");
        } else if (file.isDirectory()){
            System.out.println("該檔案為目錄");
        } else if (!file.exists()){
            System.out.println("該文件不存在");
        }
    }
}
