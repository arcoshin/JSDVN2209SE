package collection.collection_4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToListDemo_O {
    public static void main(String[] args) {
        String[] arr = {"A", "B", "C", "D", "E"};
        //方法一
        List<String> list = Arrays.asList(arr);
        list.set(0,"F");
        System.out.println(list);
        System.out.println(Arrays.toString(arr));
        List<String> list1 = new ArrayList<>(list);
        list1.set(0, "G");
        System.out.println(list1);
        System.out.println(Arrays.toString(arr));

        //方法二
        List<String> list2 = new ArrayList<>();
        list2.addAll(list);
        list2.set(0,"H");
        System.out.println(list2);
        System.out.println(Arrays.toString(arr));




    }
}
