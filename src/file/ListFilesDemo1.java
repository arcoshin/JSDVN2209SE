package file;

import java.io.File;

/**
 * 獲取指定目錄的所有子項(僅一層不含孫子項)
 */
public class ListFilesDemo1 {
    public static void main(String[] args) {
        File file = new File("./demo");
        /**
         * boolean isFile():判定當前File實例綁定的是否是一個文件
         */
        if (file.isFile()){
            System.out.println("當前綁定對象是一個文件");
        }else if (file.isDirectory()){
            System.out.println("當前綁定對象是一個目錄");
            File[] list = file.listFiles();//返回一個File數組
            System.out.println("有" + list.length + "個子項");
            for (int i = 0; i <list.length ; i++) {
                System.out.println(list[i].getName()+"\t");

            }
        }

    }
}
