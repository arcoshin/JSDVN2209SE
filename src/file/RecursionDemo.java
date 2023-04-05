package file;

import java.io.File;

public class RecursionDemo {//遞規，一定要有出口
    public static void main(String[] args) {
        File file = new File("./demo");
        /**調用遞歸方法diGuiFolder();
         *
         */
        diGuiFolder(file);

    }

    private static void diGuiFolder(File file){//形參
        if (file.isFile()){
            System.out.println("綁定對象為文件，不支持遞歸");
            return;
        } else {
            File[] list = file.listFiles();
            for (int i = 0; i <list.length ; i++) {
                if (list[i].isFile()){
                    System.out.println("文件:" + list[i]);
                }else {//反之輸出對象為目錄則繼續執行...
                    System.out.println("目錄:" + list[i]);
                    diGuiFolder(list[i]);
                }
            }
        }
    }
}
