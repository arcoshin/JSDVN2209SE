package exception;
/**
 * 捕獲多重異常
 */

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
public class TryCatchDemo2 {
    public static void main(String[] args) {
        try {
            System.out.println();
            String str = "";
            System.out.println(str.length());
            System.out.println(str.charAt(0));//獲取字符串中下標為0的字符

        } catch (NullPointerException error) {
            System.out.println("異常已解決，程序可以繼續運行了");
        } catch (StringIndexOutOfBoundsException error) {
            System.out.println("發生字符串越界，並在這裡得到了解決");
        }//程序只能根據符合的異常類型執行該catch代碼，否則依然抱錯


    }
}
