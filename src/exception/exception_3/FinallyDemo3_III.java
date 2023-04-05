package exception.exception_3;

import java.io.FileOutputStream;
import java.io.IOException;

public class FinallyDemo3_III {
    public static void main(String[] args) {
        System.out.println("starting");
        try (
                FileOutputStream fos = new FileOutputStream("./demo2/fos1.txt");
        ) {
            fos.write(1);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("ending");

    }
}
