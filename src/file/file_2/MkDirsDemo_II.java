package file.file_2;

import java.io.File;

public class MkDirsDemo_II {
    public static void main(String[] args) {
        File file = new File("./demo2/dirs/a/b/c/d/e/f/g/h/practice/j/k/l/m/n/collection_0/p/q/r/s/t/u/v/w/x/y/z");
        if (file.isFile()){
            System.out.println("檔案為文件檔");
        } else {
            file.mkdirs();
            System.out.println("創建完成");
        }


    }
}
