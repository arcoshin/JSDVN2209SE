package io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * OIS ObjectInputStream
 * 對象字節輸入流，可以實現將二進制數據轉換為對象的功能
 * 也稱為反序列化
 */
public class OISDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {


        FileInputStream fis = new FileInputStream("./demo/person.obj");
        ObjectInputStream ois = new ObjectInputStream(fis);
        /**
         * 利用ois的方法readObject，可將文件中的字節數據還原為對象
         * 但類型為Object，因為對ois來說不知道文件原來的類型
         * 所以統一當作Object來返回
         * 但是對於開發者而言通常都是知道原本類型的
         * 所以一般情況下會還原為真實類型
         * 否則對象不能調用真實內容
         */
        Person o = (Person) ois.readObject();
        o.setName("ls");
        System.out.println(o);
//        collection_0.getSex();
        ois.close();



    }
}
