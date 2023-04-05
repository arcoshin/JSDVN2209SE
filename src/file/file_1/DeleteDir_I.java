package file.file_1;

import java.io.File;

public class DeleteDir_I {
    public static void main(String[] args) {
        File file = new File("./demo/dir");
        if (file.exists()) {
            file.delete();
            System.out.println("目錄已經刪除");
        } else {
            System.out.println("目錄不存在");
        }
    }
}
