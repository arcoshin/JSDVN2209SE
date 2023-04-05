package file;

import java.io.File;
import java.io.IOException;

public class MkDirDemo {
    public static void main(String[] args) throws IOException {
        File file = new File("./demo/dir");
        if (file.exists()){
            System.out.println("目錄已存在");
        }else {
            file.mkdir();//創建指定目錄，父級目錄必須存在
            System.out.println("目錄已創建");
        }
    }
}
