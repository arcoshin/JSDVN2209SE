package collection.collection_2;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo04_II {
    public static void main(String[] args) {
        Collection c1 = new ArrayList();
        c1.add("cat");
        c1.add("dog");
        c1.add("sheep");

        Collection c2 = new ArrayList();
        c2.add("tiger");
        c2.add("pig");
        c2.add("fox");

        c1.addAll(c2);
        System.out.println(c1);
        System.out.println(c1.containsAll(c2));

        Collection c3 = new ArrayList();
        c3.add("tiger");
        c3.add("fish");
        System.out.println(c1.containsAll(c3));

        c1.retainAll(c3);//調用者保留交集
        System.out.println(c1);

        c1.removeAll(c3);//刪除交集
        System.out.println(c1);


    }
}
