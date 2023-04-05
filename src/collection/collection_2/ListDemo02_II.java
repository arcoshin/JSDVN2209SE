package collection.collection_2;

import java.util.ArrayList;
import java.util.List;

public class ListDemo02_II {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("zs");
        list.add("ls");
        list.add("ww");
        list.add("xx");
        list.add("yy");

        list.add(2,"ls&ww之間插入");
        System.out.println(list);
        list.remove(2);
        System.out.println(list);

    }
}
