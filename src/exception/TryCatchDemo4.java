package exception;
/**
 * 最終的方案
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
public class TryCatchDemo4 {
    public static void main(String[] args) {
        try {
            String str = "a";
            System.out.println(str.length());
            System.out.println(str.charAt(0));//獲取字符串中下標為0的字符
            /**
             * Integer.parseInt(str)
             * 將字符串轉為整數，但前提是字符串為純數字
             * "123" -> 123
             * "abc" -> NumberFormatException 數字格式化錯誤
             */
            System.out.println(Integer.parseInt(str));
        } catch (NullPointerException|StringIndexOutOfBoundsException error) {
            System.out.println("異常已解決，程序可以繼續運行了");
        } catch (Exception error){
            System.out.println("最終的方案，所有的異常都可以在這裡獲得解決");//保證過關，但無法過篩，故不可放在第一項
        }
        System.out.println("程序結束了");


    }
}
