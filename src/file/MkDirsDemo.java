package file;

import java.io.File;
import java.io.IOException;

public class MkDirsDemo {//創建多階目錄a/b/c......x/y/z
    public static void main(String[] args) throws IOException {
        File file = new File("./demo/dirs/a/b/c/d/e/f/g/h/practice/j/k/l/m/n/collection_0/p/q/r/s/t/u/v/w/x/y/z");
        if (file.exists()){
            System.out.println("目錄已存在");
        }else {
            file.mkdirs();//創建指定目錄，若父級目錄不存在可連帶創建
            System.out.println("目錄已創建");
        }
    }
}
