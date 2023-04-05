package collection.collection_4;

import java.util.ArrayList;
import java.util.Collection;

/**
 * addAll()
 * containsAll()
 * retainAll()
 * removeAll()
 */

public class CollectionDemo03_O {
    public static void main(String[] args) {
        Collection c1 = new ArrayList();
        c1.add("A");
        c1.add("B");
        c1.add("C");
        c1.add("D");
        c1.add("E");
        c1.add("F");
        System.out.println(c1);

        Collection c2 = new ArrayList();
        c2.add("A");
        c2.add("C");
        c2.add("E");
        c2.add("G");
        c2.add("practice_1");
        System.out.println(c2);

        Collection c3 = new ArrayList();
        c3.addAll(c1);
        c3.addAll(c2);
        System.out.println(c3);
        System.out.println(c3.containsAll(c1));
        System.out.println(c3.containsAll(c2));

        //調用者保留交集
        c3.retainAll(c1);
        System.out.println(c3);

        //刪除交集
        c3.removeAll(c1);
        System.out.println(c3);
        System.out.println(c3.isEmpty());



    }
}
