package collection.collection_1;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo02_I {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        c.add(new Point(1,2));
        c.add(new Point(3,4));
        c.add(new Point(5,6));
        c.add(new Point(7,8));
        c.add(new Point(9,0));
        System.out.println(c);
        Point p = new Point(1, 2);
        System.out.println(p);
        System.out.println(c.contains(p));
        c.remove(p);
        System.out.println(c.contains(p));
    }

}
