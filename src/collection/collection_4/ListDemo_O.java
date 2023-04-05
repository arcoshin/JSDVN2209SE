package collection.collection_4;
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
        list.add("zz");
        System.out.println(list);
        list.clear();
        System.out.println(list.isEmpty());

        /**
         * 1~10取3~7出來*10看子集合和原集合差異
         */
        for (int i = 1; i <= 10; i++) {
            list.add(i);
        }
        System.out.println(list);
        List<Integer> subList = list.subList(2, 7);
        System.out.println(subList);
        for (int i = 0; i < subList.size(); i++) {
            subList.set(i, subList.get(i) * 10);
        }
        System.out.println(list);


    }
}
