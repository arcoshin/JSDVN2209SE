package exception.exception_2;

public class FinallyDemo1_II {
    public static void main(String[] args) {

        try {
            System.out.println("程序開始了");
            String str = null;
            System.out.println(str.length());
            return;//仍然會執行到finally
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("程序出錯了");
        } finally {
            System.out.println("finally代碼塊被執行了");
        }
        System.out.println("程序結束了");


    }
}
