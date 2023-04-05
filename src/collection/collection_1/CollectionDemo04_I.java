package collection.collection_1;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo04_I {
    public static void main(String[] args) {
        Collection c1 = new ArrayList();
        c1.add("cat");
        c1.add("dog");
        c1.add("sheep");
        System.out.println("c1" + c1);

        Collection c2 = new ArrayList();
        c2.add("tiger");
        c2.add("pig");
        c2.add("fox");
        System.out.println("c2" + c2);

        c1.addAll(c2);
        System.out.println(c1);
        c1.add(c2);
        System.out.println(c1);
        c1.add("cat");
        System.out.println("c1" + c1);
        c2.add("pig");
        System.out.println("c2" + c2);

        System.out.println(c1.containsAll(c2));

        c1.retainAll(c2);
        System.out.println("c1" + c1);

        c1.add("fish");
        c1.removeAll(c2);
        System.out.println("c1" + c1);


    }
}
