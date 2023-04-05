package file;

import java.io.File;

/**
 * 刪除多重目錄類 : 現階段自我練習
 */
public class DeleteDirs {
    public static void main(String[] args) {
        File file = new File("./demo/dirs");//創建並綁定file對象
        System.out.println("正在開始刪除檔案...");
        deleteDirs(file);//調用遞歸刪除方法
        System.out.println("所有檔案已經刪除完畢");
    }

    public static void deleteDirs(File file) {
        file.delete();//先自刪一次，若不能刪除乾淨才繼續(非空目錄無法直接刪除)
        if (file.exists()) {//如果檔案仍存在()
            File[] list = file.listFiles();//創建一個File數組接收當前對象之下的檔案清單
            for (int i = 0; i < list.length; i++) {//調用清單上的每個對象
                /**
                 * 調用方法刪除自己並且持續遞歸至資料夾可以成功刪除時停止(代表到了最內層)
                 * */
                deleteDirs(list[i]);//注意此處只能成功刪除了最內層
                deleteDirs(file);//重複調用刪除最內層的方法直到清空全部(清空內部->清空自己->遞歸到傳入的file)
            }
        }return;//刪除乾淨即不需繼續執行
    }
}
