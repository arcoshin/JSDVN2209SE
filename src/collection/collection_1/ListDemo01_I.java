package collection.collection_1;

import java.util.ArrayList;
import java.util.List;

public class ListDemo01_I {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("zs");
        list.add("ls");
        list.add("ww");
        list.add("aa");
        list.add("bb");
        System.out.println(list);
        list.set(3, "xx");
        list.set(4, "yy");
        System.out.println(list);

//        for (int practice = 0; practice < list.size(); practice++) {
//            System.out.print(list.get(practice)+"\t");
//        }
        for (String s : list) {
            System.out.print(s + "\t");
        }


    }
}
