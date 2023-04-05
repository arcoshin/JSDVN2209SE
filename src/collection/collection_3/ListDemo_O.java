package collection.collection_3;
/**
 * add(),set(),get()
 * add()插入,remove()
 */

import java.util.ArrayList;
import java.util.List;

public class ListDemo_O {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("zs");
        list.add("ls");
        list.add("ww");
        list.add("xx");
        list.add("yy");

        /**
         * 1~10取3~7出來*10看子集合和原集合差異
         */
        for (int i = 1; i <= 10; i++) {
            list.add(i);
        }
        list.remove(0);
        list.remove(0);
        list.remove(0);
        list.remove(0);
        list.remove(0);
        System.out.println(list);

        List<Integer> sub = list.subList(2, 7);
        System.out.println(sub);
        for (int i = 0; i < sub.size(); i++) {
            sub.set(i, sub.get(i) * 10);
        }
        System.out.println(list);


    }
}
