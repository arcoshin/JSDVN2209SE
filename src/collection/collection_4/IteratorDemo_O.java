package collection.collection_4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorDemo_O {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        c.add(8);
        c.add(0);
        c.add(16);
        c.add(0);
        c.add(24);
        c.add(0);
        c.add(32);
        c.add(0);
        c.add(40);
        c.add(0);

        Iterator it = c.iterator();
        while (it.hasNext()){
            System.out.println(it.next());

            if ((Integer) it.next() == 0){
                it.remove();
            }

        }






    }
}
