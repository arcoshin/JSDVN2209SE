package collection.collection_2;
/**
 * 極度重要
 */

import java.util.*;

public class MapDemo02_II {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap();
        map.put("ww", 99);
        map.put("xx", 100);
        map.put("yy", 60);
        map.put("zz", 88);

        /**================================
         * 單獨遍歷key
         ================================*/
        System.out.println(map.keySet());
        Set<String> set = map.keySet();

        //Old
        Iterator it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println(set);

        //New
        for (String s : set) {
            System.out.println(s);
        }

        /**================================
         * 遍歷鍵值對
         ================================*/
        //Old
        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        Iterator entryIterator = entrySet.iterator();
        while (entryIterator.hasNext()) {
            System.out.println(entryIterator.next());
        }
        //New
        for (Map.Entry<String, Integer> entry : entrySet) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }

        /**================================
         * 單獨遍歷value
         ================================*/
        Collection list = map.values();
        //Old
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        //New
        for (Object o : list) {
            System.out.println(o);
        }
        /**================================
         * Lambda
         ================================*/
        map.forEach(
                (k, v) -> System.out.println(k + "," + v)
        );

        ArrayList arrayList = new ArrayList<>();
        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");
        arrayList.add("D");
        arrayList.add("E");
        arrayList.forEach(System.out::println);//只有一個參數時

        set.forEach(System.out::println);
        list.forEach(System.out::println);

    }
}
