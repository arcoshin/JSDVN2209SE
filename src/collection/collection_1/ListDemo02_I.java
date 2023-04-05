package collection.collection_1;

import java.util.ArrayList;
import java.util.List;

public class ListDemo02_I {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("zs");
        list.add("ls");
        list.add("ww");
        list.add("aa");
        list.add("bb");

        list.remove(3);
        list.remove(3);
        System.out.println(list);


    }
}
