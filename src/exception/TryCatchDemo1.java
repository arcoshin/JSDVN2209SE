package exception;

/**
 * Java的虛擬機對於程序處理異常的時候，默認的處理方式
 * 1.直接告知問題所在的位置與類型
 * 2.立即停止對於高程序的執行
 * 所以如果程序出現了異常，不可能任憑虛擬機默認處理
 * 所以也需要具備自行處理異常的手段
 * 使用try...catch...進行異常處理(也稱為異常捕獲)
 * try{
 *     可能出現異常的代碼
 * }catch(異常類型 變量名){
 *     異常處理代碼
 * }
 *
 *
 */
public class TryCatchDemo1 {
    public static void main(String[] args) {
        /**
         * 快捷鍵 Ctrl + Alt + T
         */
        try {
            System.out.println("程序開始了");
            String str = null;
            System.out.println(str.length());//返回字符串的長度
            //System.out.println();異常之後的代碼不會被執行直接跳轉Catch

        } catch (NullPointerException error){
            System.out.println("異常已解決，程序可以繼續運行了");
        }
        System.out.println("程序結束了");


    }
}
