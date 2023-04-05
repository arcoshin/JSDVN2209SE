package collection.collection_1;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo03_I {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        Point p = new Point(1, 2);
        c.add(p);
        System.out.println(c);
        p.setX(3);
        System.out.println(c);


    }
}
