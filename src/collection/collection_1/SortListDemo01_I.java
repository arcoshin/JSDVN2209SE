package collection.collection_1;

import java.util.*;

public class SortListDemo01_I {
    public static void main(String[] args) {
        List list = new ArrayList();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            list.add(random.nextInt(100));
        }
        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);
        Collections.reverse(list);
        System.out.println(list);

    }
}
