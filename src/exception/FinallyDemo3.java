package exception;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * JDK7之後，java推出了自動關閉特性
 * 使得異常機制在IO應用中得以大幅簡化
 */
public class FinallyDemo3 {
    public static void main(String[] args) {
        System.out.println("程序開始了");
        try (
                //將流的創建寫在()中，程序執行結束後會自動關閉
                FileOutputStream fos = new FileOutputStream("./demo/fos.txt")
        ) {
            fos.write(1);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("程序結束了");
    }
}
