package collection.collection_3;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Point()是否複用,remove(),contain(),setX()
 */

public class CollectionDemo02_O {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        c.add(new Person_III(1,2));
        c.add(new Person_III(3,4));
        c.add(new Person_III(5,6));
        c.add(new Person_III(7,8));
        c.add(new Person_III(9,0));

        Person_III p = new Person_III(1, 2);
        System.out.println(c.contains(p));
        c.add(p);
        System.out.println(c);
        p.setX(7);
        System.out.println(c);
        c.remove(p);
        System.out.println(c);


    }
}
