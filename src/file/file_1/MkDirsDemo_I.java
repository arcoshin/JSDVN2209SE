package file.file_1;

import java.io.File;

public class MkDirsDemo_I {
    public static void main(String[] args) {
        File file = new File("./demo/dirs/a/b/c/d/e/f/g/h/practice/j/k/l/m/n/collection_0/p/q/r/s/t/u/v/w/x/y/z");
        if (file.exists()) {
            System.out.println("目錄已經存在");
        } else {
            file.mkdirs();
            System.out.println("目錄創建完成");
        }
    }
}
