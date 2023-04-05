package file;

import java.io.File;

/**
 * 刪除目錄類 : 不能刪除非空目錄!!
 */
public class DeleteDir {
    public static void main(String[] args) {
        //刪除demo下2209目錄(手動創建)
        File file = new File("./demo/dir");
        if (file.exists()){
            file.delete();
            System.out.println("該目錄已刪除");
        }else {
            System.out.println("該目錄不存在");
        }

    }
}
