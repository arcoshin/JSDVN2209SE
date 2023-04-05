package file.file_1;

import java.io.File;
import java.io.IOException;

public class CreateNewFile_I {
    public static void main(String[] args) throws IOException {
        File file = new File("./demo/hello.txt");
        if (file.exists()) {
            System.out.println("檔案已經存在");
        } else {
            file.createNewFile();
            System.out.println("檔案創建完成");
        }
    }
}
