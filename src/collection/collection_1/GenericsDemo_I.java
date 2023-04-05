package collection.collection_1;

import java.util.ArrayList;
import java.util.Collection;

public class GenericsDemo_I {
    public static void main(String[] args) {
        Collection<Integer> c1 = new ArrayList<>();
        Collection<String> c2 = new ArrayList<>();
        c1.add(1000);
//        c2.add(1000);
//        c1.add("1000");
        c2.add("1000");


    }
}
