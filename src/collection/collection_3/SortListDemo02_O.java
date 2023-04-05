package collection.collection_3;

import java.util.*;

public class SortListDemo02_O {
    public static void main(String[] args) {
        /**
         * 創造五個p點，自定義排序
         */
        List<Person_III> c = new ArrayList();
        c.add(new Person_III(new Random().nextInt(20), new Random().nextInt(200)));
        c.add(new Person_III(new Random().nextInt(20), new Random().nextInt(200)));
        c.add(new Person_III(new Random().nextInt(20), new Random().nextInt(200)));
        c.add(new Person_III(new Random().nextInt(20), new Random().nextInt(200)));
        c.add(new Person_III(new Random().nextInt(20), new Random().nextInt(200)));
        System.out.println(c);

        Collections.sort(c, new Comparator<Person_III>() {
            @Override
            public int compare(Person_III o1, Person_III o2) {
                return o1.getX() - o2.getX();
            }
        });

        //Lambda-忽略接口名、方法名
        Collections.sort(c, (Person_III o1, Person_III o2) -> {
            return o1.getX() - o2.getX();
        });

        //Lambda-忽略參數類型
        Collections.sort(c, (o1, o2) -> {
            return o1.getX() - o2.getX();
        });

        //Lambda-多重參數，該括弧不可省略

        //Lambda-指令只有一行，該大花括弧可以省略，return必須消除
        Collections.sort(c, (o1, o2) -> o1.getX() - o2.getX());


        Collections.sort(c, (p1, p2) -> p1.getY() - p2.getY());
        System.out.println(c);


    }

}
