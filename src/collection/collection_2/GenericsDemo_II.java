package collection.collection_2;

import java.util.ArrayList;
import java.util.Collection;

public class GenericsDemo_II {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        c.add("one");
        c.add("1");

        Collection<String> c1 = new ArrayList<>();
        c1.add("12");
//        c1.add(12);


    }
}
