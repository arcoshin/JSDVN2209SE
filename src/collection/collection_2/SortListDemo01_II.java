package collection.collection_2;

import java.util.*;

public class SortListDemo01_II {
    public static void main(String[] args) {
        Random random = new Random();
        List list = new ArrayList();
        for (int i = 0; i < 10; i++) {
            list.add(random.nextInt(100));
        }
        System.out.println(list);

        /**=========
         * 常犯錯誤
         ==========*/
        Collections.sort(list);
        System.out.println(list);
        Collections.reverse(list);
        System.out.println(list);


    }

}
