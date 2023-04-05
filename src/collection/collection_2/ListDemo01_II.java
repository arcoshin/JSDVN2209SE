package collection.collection_2;

import java.util.ArrayList;
import java.util.List;

public class ListDemo01_II {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("zs");
        list.add("ls");
        list.add("ww");
        list.add("xx");
        list.add("yy");

        System.out.println(list.get(3));
        list.set(2,"ww被我換掉了");
        System.out.println(list);


    }
}
