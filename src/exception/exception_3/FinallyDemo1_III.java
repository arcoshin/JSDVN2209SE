package exception.exception_3;

public class FinallyDemo1_III {
    public static void main(String[] args) {
        try {
            System.out.println("Starting");
            String s = null;
            System.out.println(s.length());
            System.out.println("never come here !");
        } catch (Exception e) {
            System.out.println("error1");
            e.printStackTrace();
            System.out.println("error2");
        } finally {
            System.out.println("finally area has done");
        }
        System.out.println("finish!");


    }
}
