package exception;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 異常處理機制在IO中的應用
 */
public class FinallyDemo2 {
    public static void main(String[] args) {
        System.out.println("程序開始了");
        FileOutputStream fos = null;
        try {
            System.out.println(1 / 0);
            fos = new FileOutputStream("./demo/fos.txt");
            fos.write(1);
//            fos.close();可能不會被執行到
        } catch (Exception e) {
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
        }System.out.println("程序結束了");


    }
}
