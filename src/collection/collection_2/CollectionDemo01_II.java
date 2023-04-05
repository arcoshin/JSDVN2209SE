package collection.collection_2;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo01_II {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        c.add("one");
        c.add("two");
        c.add("three");
        System.out.println(c);
        System.out.println(c.isEmpty());
        c.clear();
        System.out.println(c.isEmpty());


    }
}
