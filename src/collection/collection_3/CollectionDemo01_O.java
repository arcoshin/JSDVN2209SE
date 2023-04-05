package collection.collection_3;

import java.util.ArrayList;
import java.util.Collection;

/**
 * add(),isEmpty(),clear()
 */

public class CollectionDemo01_O {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        c.add("A");
        c.add("B");
        c.add("C");
        System.out.println(c);
        c.clear();
        System.out.println(c.isEmpty());
        System.out.println(c.size());
        System.out.println(c);


    }
}
