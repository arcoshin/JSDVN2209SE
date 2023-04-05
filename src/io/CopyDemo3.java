package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 由於快讀時，data數組在最後一次讀取時會有殘塊(不剛好時)
 * 致使複製的檔案容量增大
 * 解決方案 : 讀多少寫多少
 */
public class CopyDemo3 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("./demo/1.png");
        FileOutputStream fos = new FileOutputStream("./demo/4.png");
        byte[] data = new byte[10240];//快讀10KB
        int len;
        long start = System.currentTimeMillis();
        while ((len = fis.read(data)) != -1){
            fos.write(data,0,len);
        }
        long end = System.currentTimeMillis();
        System.out.println("文件複製完畢");
        System.out.println("共耗時" + (end - start) + "毫秒");
        fis.close();
        fos.close();

    }
}
