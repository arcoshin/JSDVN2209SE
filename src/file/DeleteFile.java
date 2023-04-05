package file;

import java.io.File;

public class DeleteFile {
    public static void main(String[] args) {
        File file = new File("./demo/hello.txt");
        if (file.exists()){
            file.delete();
            System.out.println("文件已刪除");
        }else {
            System.out.println("文件不存在");
        }


    }
}
