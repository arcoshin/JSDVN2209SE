package collection.collection_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToListDemo_I {
    public static void main(String[] args) {
        String[] str = {"A","B","C","D","E"};
        List<String> list = Arrays.asList(str);
        list.set(0,"FF");
        System.out.print(list);
        System.out.println();
        System.out.print(Arrays.toString(str));

        List<String> list1 = new ArrayList<>(list);
        System.out.println(list1);
        list1.set(0,"UU");
        System.out.print(list);
        System.out.println();
        System.out.print(Arrays.toString(str));

        List<String> list2 = new ArrayList<>();
        list2.addAll(list);
        System.out.println(list2);
        list2.set(0,"CC");
        System.out.print(list);
        System.out.println();
        System.out.print(Arrays.toString(str));

        System.out.println(list1);
        System.out.println(list2);


    }
}
