package exception.exception_1;

public class TryCatchDemo4_I {
    public static void main(String[] args) {
        try {
            String str = "";
            System.out.println(str.length());
            System.out.println(str.charAt(0));
        } catch (StringIndexOutOfBoundsException | NullPointerException e) {
            System.out.println("不管怎樣，多喝熱開水");
        } catch (Exception e){//保證抓取
            System.out.println("問題已解決");
        }
        System.out.println("程序正常運行");
    }
}
