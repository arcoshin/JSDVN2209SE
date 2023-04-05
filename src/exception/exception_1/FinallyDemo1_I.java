package exception.exception_1;

public class FinallyDemo1_I {
    public static void main(String[] args) {
        try {
            System.out.println("程序開始了");
            String str = null;
            System.out.println(str.length());
            return;
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("出錯了!!");
        } finally {
            System.out.println("finally區塊中的代碼被執行了");
        }
        System.out.println("程序結束了");
    }
}
