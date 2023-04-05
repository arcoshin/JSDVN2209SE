package file;

import java.io.File;
import java.io.FileFilter;

/**
 * 獲取一個符合條件的子項
 * File[] listFile();獲取所有子項
 * File[] listFile(FileFilter filter);獲取所有符合條件子項
 */
public class ListFilesDemo2 {
    public static void main(String[] args) {
        File file = new File("./demo/dirs");
        FileFilter fF = new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                /**
                 * 定義過濾規則
                 */
                String name = pathname.getName();//pathname表示當前每個被過濾的對象
                System.out.println("正在過濾:" + name);
                return name.contains("collection_0");//判斷當前文件名是否包含"collection_0"
            }
        };
        File[] list = file.listFiles(fF);
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }
    }
}
