package file;

import java.io.File;

/**
 *  學習File工具基本操作
 *  File類的每一個實例可以表示硬盤中的一個文件或目錄
 *  使用File可以做到
 *      1.訪問其表示的
 */
public class FileDemo {
    public static void main(String[] args) {
        /**快速生成變量名
         * 1. Ctrl + Alt + V
         * 2. Alt + Enter
         * 3. .var
         */

        File file = new File("./demo/file.txt");
        // './' 表示當前項目的路徑，可省略
        System.out.println(file.getName());//輸出文件名
        System.out.println(file.length());//文件的長度(一個中文是三個字節)
        
    }
}
