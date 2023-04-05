package collection.collection_4;

import java.util.*;

public class SortListDemo02_O {
    public static void main(String[] args) {
        /**
         * 創造五個p點，自定義排序
         */
        Random r = new Random();
        List list = new ArrayList();
        list.add(new Person_IV(r.nextInt(10),r.nextInt(50)));
        list.add(new Person_IV(r.nextInt(10),r.nextInt(50)));
        list.add(new Person_IV(r.nextInt(10),r.nextInt(50)));
        list.add(new Person_IV(r.nextInt(10),r.nextInt(50)));
        list.add(new Person_IV(r.nextInt(10),r.nextInt(50)));
        list.add(new Person_IV(r.nextInt(10),r.nextInt(50)));
        list.add(new Person_IV(r.nextInt(10),r.nextInt(50)));
        list.add(new Person_IV(r.nextInt(10),r.nextInt(50)));
        list.add(new Person_IV(r.nextInt(10),r.nextInt(50)));
        list.add(new Person_IV(r.nextInt(10),r.nextInt(50)));
        list.add(new Person_IV(r.nextInt(10),r.nextInt(50)));

        Collections.sort(list, new Comparator<Person_IV>() {
            @Override
            public int compare(Person_IV p1, Person_IV p2) {
                return p1.getX() - p2.getX();
            }
        });
        System.out.println(list);

        Collections.sort(list, (Comparator<Person_IV>) (p1, p2) -> p1.getX() - p2.getX());
        System.out.println(list);

    }

}
