package collection.collection_3;
/**
 * addAll()
 * containsAll()
 * retainAll()
 * removeAll()
 */

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo03_O {
    public static void main(String[] args) {
        Collection c1 = new ArrayList();
        c1.add("dog");
        c1.add("cat");
        c1.add("sheep");

        Collection c2 = new ArrayList();
        c2.add("tiger");
        c2.add("pig");
        c2.add("fox");

        c1.addAll(c2);
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c1.containsAll(c2));

        c1.removeAll(c2);
        System.out.println(c1);
        System.out.println(c2);

        c1.addAll(c2);
        c1.add("fish");
        c1.retainAll(c2);
        System.out.println(c1);
        System.out.println(c2);

        //調用者保留交集

        //刪除交集



    }
}
