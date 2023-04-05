package exception.exception_2;

import java.io.FileOutputStream;

public class FinallyDemo3_II {
    public static void main(String[] args) {
        System.out.println("程序開始了");
        try (
                FileOutputStream fos = new FileOutputStream("./demo2/fos.txt");
        ) {
            fos.write(1);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("程序結束了");


    }
}
