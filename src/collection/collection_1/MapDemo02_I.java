package collection.collection_1;

import java.util.*;

public class MapDemo02_I {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("國文", 75);
        map.put("英文", 77);
        map.put("數學", 100);
        map.put("自然", 88);
        map.put("社會", 87);
        map.put("體育", 1000);

        //遍歷key
        Set<String> set = map.keySet();
        for (String s : set) {
            System.out.print(s + "\t");
        }
        System.out.println();

        //遍歷鍵值對=>找entry
        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        for (Map.Entry<String, Integer> entry : entrySet) {
            System.out.println(entry.getKey() + "," + entry.getValue());
        }

        //遍歷value=>幾乎沒在用
        Collection<Integer> c = map.values();
        for (Integer n : c) {
            System.out.print(n + " ");
        }
        System.out.println();

        //Lambda
        map.forEach(
                (k, v) -> System.out.println(k + ":" + v)
        );

        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        list.forEach(
                System.out::println
        );
    }
}
