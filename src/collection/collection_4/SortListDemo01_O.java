package collection.collection_4;

import java.util.*;

public class SortListDemo01_O {
    public static void main(String[] args) {
        /**
         * 十個隨機數[1~100]形成一集合，正序、反序排列
         */
        Random r = new Random();
        List c = new ArrayList();
        c.add(r.nextInt(50));
        c.add(r.nextInt(50));
        c.add(r.nextInt(50));
        c.add(r.nextInt(50));
        c.add(r.nextInt(50));
        c.add(r.nextInt(50));
        c.add(r.nextInt(50));
        c.add(r.nextInt(50));
        c.add(r.nextInt(50));
        c.add(r.nextInt(50));

        Collections.sort(c);
        System.out.println(c);

        Collections.reverse(c);
        System.out.println(c);


    }

}
