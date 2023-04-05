package collection.collection_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class SortListDemo01_O {
    public static void main(String[] args) {
        /**
         * 十個隨機數[1~100]形成一集合，正序、反序排列
         */
        Random random = new Random();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i, random.nextInt(100));
        }
        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);
        Collections.reverse(list);
        System.out.println(list);


    }

}
