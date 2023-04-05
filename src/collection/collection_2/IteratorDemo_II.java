package collection.collection_2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorDemo_II {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        c.add("8");
        c.add("0");
        c.add("16");
        c.add("0");
        c.add("24");
        c.add("0");
        c.add("32");
        c.add("0");
        c.add("40");
        c.add("0");

        Iterator it = c.iterator();
        while (it.hasNext()) {
            if (it.next().equals("0")) {
                it.remove();
            }
        }
        System.out.println(c);



    }
}
