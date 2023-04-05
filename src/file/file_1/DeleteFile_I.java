package file.file_1;

import java.io.File;

public class DeleteFile_I {
    public static void main(String[] args) {
        File file = new File("./demo/hello.txt");
        if (file.exists()) {
            file.delete();
            System.out.println("檔案已刪除");
        } else {
            System.out.println("檔案不存在");
        }
    }
}
