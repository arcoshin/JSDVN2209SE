package io;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/**
 * 緩衝流寫出數據的緩衝區問題
 * 底層邏輯為8K塊讀
 * 而緩衝區未滿則不會自動寫出
 * 需強制輸出或關流，其中關流會自動調用flush方法寫出。
 */
public class FlushDemo {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("./demo/flush.txt");
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        bos.write("有情人終成眷屬，有錢人終成痛苦".getBytes(StandardCharsets.UTF_8));
        System.out.println("寫入完畢");
//        bos.close();底層邏輯會調用flush();
        bos.flush();

    }
}
