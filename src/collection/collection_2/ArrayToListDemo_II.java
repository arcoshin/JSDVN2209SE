package collection.collection_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToListDemo_II {
    public static void main(String[] args) {
        String[] arr = {"A", "B", "C", "D", "E"};
        List c = Arrays.asList(arr);//套用容易，但不可直接對此集合編輯，反則數組連動
        System.out.println(c);

        List c1 = new ArrayList(c);
        System.out.println(c1);
        c1.add("F");
        System.out.println(c1);
        for (String s : arr) {
            System.out.print(s + " ");
        }
        System.out.println();

        List c2 = new ArrayList();
        c2.addAll(c);
        c2.add("G");
        System.out.println(c2);
        for (String s : arr) {
            System.out.print(s + " ");
        }
        System.out.println();

        c.set(4,"H");//長度不可隨意編輯(數組特性，而此集合又與數組連動)
        System.out.println(c);
        for (String s : arr) {
            System.out.print(s + " ");
        }




    }
}
