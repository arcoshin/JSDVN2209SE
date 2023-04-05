package file.file_2;

import java.io.File;
import java.io.IOException;

public class CreateNewFile_II {
    public static void main(String[] args) throws IOException {

        File file = new File("./demo2/hello.txt");
        if (file.exists()) {
            System.out.println("檔案已存在");
        } else {
            file.createNewFile();
            System.out.println("檔案創建完成");
        }
    }
}
