package exception.exception_1;

import java.io.FileOutputStream;

public class FinallyDemo3_I {
    public static void main(String[] args) {
        System.out.println("程序開始運行了");
        try (
                FileOutputStream fos = new FileOutputStream("./demo/fos.txt");
        ) {
            fos.write(1);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("程序結束了");


    }
}
