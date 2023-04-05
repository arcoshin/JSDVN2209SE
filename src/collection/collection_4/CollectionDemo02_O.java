package collection.collection_4;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Point()是否複用,remove(),contain(),setX()
 */

public class CollectionDemo02_O {
    public static void main(String[] args) {

        Collection c = new ArrayList();
        c.add(new Person_IV(1,2));
        c.add(new Person_IV(3,4));
        c.add(new Person_IV(5,6));
        c.add(new Person_IV(7,8));
        c.add(new Person_IV(9,10));

        Person_IV p4 = new Person_IV(1,2);
        System.out.println(c.contains(p4));

        p4.setX(9);
        System.out.println(p4);

        c.remove(p4);
        System.out.println(c.contains(p4));




    }
}
