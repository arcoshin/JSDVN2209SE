package io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * OOS ObjectOutputStream
 * 可以將對象寫入內存中
 */
public class OOSDemo {
    public static void main(String[] args) throws IOException {

        Person p = new Person("zs",18,"喜歡流浪");
        System.out.println(p);

        FileOutputStream fos = new FileOutputStream("./demo/person.obj");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        /**
         * 將指定對象通過oos實現序列化
         * 但要序列化則須在 被序列化的對象類 實現 Serializable接口
         * 寫入文件時由於序列化，會呈現二進制，不需理會
         */
        oos.writeObject(p);
        System.out.println("寫出完畢");
        oos.close();

    }
}
