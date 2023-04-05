package exception.exception_1;

import java.io.FileOutputStream;
import java.io.IOException;

public class FinallyDemo2_I {
    public static void main(String[] args) {
        System.out.println("程序開始運行了");
        FileOutputStream fos = null;

        try {
            System.out.println(1 / 0);
            fos = new FileOutputStream("./demo/fos.txt");
            fos.write(1);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fos != null) {
                    fos.close();
                    System.out.println("資源釋放了");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println("程序結束了");


    }
}
