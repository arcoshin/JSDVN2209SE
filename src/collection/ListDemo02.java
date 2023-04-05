package collection;

import java.util.ArrayList;
import java.util.List;

/**
 * List中重載了一對add與remove方法
 */
public class ListDemo02 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("aa");
        list.add("bb");
        list.add("cc");
        list.add("dd");
        list.add("ee");
        System.out.println(list);
        /**
         * void add(int index,E e)
         * 將給定的元素插入到指定的位置，原下標的元素則後移，並非取代
         */
        list.add(3,"ff");
        System.out.println(list);
        /**
         * E remove(int index)
         * 刪除 並返回指定位置上的元素
         */
        String name = list.remove(3);
        System.out.println("list.add的返回值:"+name);
        System.out.print(list);

    }
}
