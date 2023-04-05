package exception.exception_1;

public class TryCatchDemo2_I {
    public static void main(String[] args) {
        try {
            String str = "";
            System.out.println(str.length());
            System.out.println(str.charAt(0));
        } catch (StringIndexOutOfBoundsException e) {
            e.printStackTrace();
        } catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("程序正常運行");
    }
}
