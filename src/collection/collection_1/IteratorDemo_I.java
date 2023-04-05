package collection.collection_1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Random;

public class IteratorDemo_I {
    public static void main(String[] args) {
        Random random = new Random();
        Collection c = new ArrayList();
        for (int i = 0; i < 10; i++) {
            c.add(random.nextInt(100));
        }
        System.out.println(c);

        Iterator it = c.iterator();
        while (it.hasNext()){
            Integer n = (Integer) it.next();
            System.out.print(n+" ");
            it.remove();
        }
    }
}
