package exception;

/**
 * finally區塊
 * 是異常處理機制中的最後一塊，
 * 它可以直接跟在try語句之後，或最後一組catch語句後
 * 特點是可以保證，只要程序執行到了try語句中
 * 無論是否出現異常，最終都要執行finally
 * 因此我們經常利用此特性，來解決釋放資源的問題，如IO最後的close()
 */
public class FinallyDemo1 {
    public static void main(String[] args) {
        System.out.println("程序開始了");
        try {
            String str = null;
            System.out.println(str.length());
            return;//仍然會進行到finally塊
        } catch (Exception e) {
            System.out.println("出錯了!");
            /**
             * 打印異常的代碼
             * 不同於報錯，此處程序仍可運行不會中止
             * 並且可輸出打印錯誤類型以供開發人員知悉
             */
            e.printStackTrace();
        } finally {//不論前面結果如何都會執行finally塊
            System.out.println("finally區塊中的代碼被執行了");
        }
        System.out.println("程序結束了");//若是return成功則不會執行到此
    }
}
