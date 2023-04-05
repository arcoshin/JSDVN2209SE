package collection.collection_1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class NewForDemo_I {
    public static void main(String[] args) {
        String[] arr = {"A","B","C","D","E","F"};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.println();

        for (String s : arr) {
            System.out.print(s);
        }
        System.out.println();

        Collection<String> c = new ArrayList();
        c.add("a");
        c.add("b");
        c.add("c");
        c.add("d");
        c.add("e");

        //傳統遍歷使用迭代器
        Iterator it = c.iterator();
        while (it.hasNext()){
            String str = (String) it.next();
            System.out.print(str);
        }
        System.out.println();

        //新型遍歷使用增強型for循環
        for (String s : c) {
            System.out.print(s);
        }



    }
}
