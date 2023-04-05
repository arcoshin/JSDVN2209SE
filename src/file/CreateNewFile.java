package file;

import java.io.File;
import java.io.IOException;

public class CreateNewFile {
    public static void main(String[] args) throws IOException {
        File file = new File("./demo/hello.txt");
        if (file.exists()){
            //返回true(已存在)不動作
            System.out.println("該文件已存在");
        }else {
            file.createNewFile();
            System.out.println("文件已創建!");
        }
    }
}
