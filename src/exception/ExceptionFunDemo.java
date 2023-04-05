package exception;

/**
 * 異常的常用方法
 */
public class ExceptionFunDemo {
    public static void main(String[] args) {
        System.out.println("程序開始了");
        /**
         * 快速生成try...catch結構
         * 圈選要被try包裹的代碼
         * 按 Ctrl + alt + T -> try/catch
         */
        try {
            String str = null;
            System.out.println(str.length());
        } catch (Exception e) {
            /**
             * 打印異常的代碼
             * 不同於報錯，此處程序仍可運行不會中止
             * 並且可輸出打印錯誤類型以供開發人員知悉
             */
            e.printStackTrace();
        }
        System.out.println("程序結束了");



    }
}
