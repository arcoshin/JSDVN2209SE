package collection.collection_1;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo01_I {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        System.out.println(c.size());
        c.add("one");
        c.add("two");
        System.out.println(c.size());
        c.add("three");
        c.add("four");
        System.out.println(c.size());
        c.clear();
        System.out.println(c.size());
        System.out.println(c.isEmpty());
    }
}
