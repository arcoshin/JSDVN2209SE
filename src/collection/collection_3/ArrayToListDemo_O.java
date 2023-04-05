package collection.collection_3;

import java.util.*;

public class ArrayToListDemo_O {
    public static void main(String[] args) {
        String[] arr = {"A", "B", "C", "D", "E"};
        List<String> list = Arrays.asList(arr);
        list.set(4,"EF");
        System.out.println(list);
        System.out.println(Arrays.toString(arr));
        list.set(4,"E");

        //方法一
        List<String> list1 = new ArrayList<>(list);
        list1.set(4,"F");
        System.out.println(list1);
        System.out.println(list);
        System.out.println(Arrays.toString(arr));

        //方法二
        List<String> list2 = new ArrayList<>();
        list2.addAll(list);
        list2.set(4,"G");
        System.out.println(list2);
        System.out.println(list);
        System.out.println(Arrays.toString(arr));





    }
}
