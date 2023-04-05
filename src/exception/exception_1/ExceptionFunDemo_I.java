package exception.exception_1;

public class ExceptionFunDemo_I {
    public static void main(String[] args) {
        try {
            String str = null;
            System.out.println(str.length());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
