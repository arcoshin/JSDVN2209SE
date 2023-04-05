package collection.collection_4;

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
        c.add("D");
        c.add("E");
        System.out.println(c);
        c.clear();
        System.out.println(c);
        System.out.println(c.isEmpty());


    }
}
