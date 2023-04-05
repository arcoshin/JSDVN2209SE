package collection.collection_3;
/**
 * 極度重要
 */

import java.util.*;

public class MapDemo02_O {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap();
        map.put("ww", 99);
        map.put("xx", 100);
        map.put("yy", 60);
        map.put("zz", 88);

        /**================================
         * 單獨遍歷key
         ================================*/
        Set<String> s1 = map.keySet();

        //Old
        Iterator<String> it_key = s1.iterator();
        while (it_key.hasNext()) {
            System.out.print(it_key.next() + "\t");
        }

        //New
        System.out.println();
        for (String s : s1) {
            System.out.print(s + "\t");
        }

        //Each
        System.out.println();
        s1.forEach(
                (s2 -> System.out.print(s2 + "\t"))
        );

        //Each.Lambda
        System.out.println();
        s1.forEach(
                System.out::print
        );


        /**================================
         * 遍歷鍵值對
         ================================*/
        Set<Map.Entry<String, Integer>> entry = map.entrySet();

        //Old
        System.out.println();
        Iterator<Map.Entry<String, Integer>> it_entry = entry.iterator();
        while (it_entry.hasNext()) {
            System.out.print(it_entry.next() + "\t");
        }

        //New
        System.out.println();
        for (Map.Entry<String, Integer> entry1 : entry) {
            System.out.print(entry1 + "\t");
        }

        //Each
        System.out.println();
        entry.forEach(
                entry2 ->System.out.print(entry2 + "\t")
        );

        //Each.Lambda
        System.out.println();
        entry.forEach(
                System.out::print
        );


        /**================================
         * 單獨遍歷value
         ================================*/
        Collection<Integer> value = map.values();

        //Old
        System.out.println();
        Iterator it_value = value.iterator();
        while (it_value.hasNext()){
            System.out.print(it_value.next() + "\t");
        }

        //New
        System.out.println();
        for (Integer e_value : value) {
            System.out.print(e_value + "\t");
        }

        //Each
        System.out.println();
        value.forEach(
                v -> System.out.println(v + "\t")
        );

        //Each.Lambda
        value.forEach(
                System.out::print
        );


        /**================================
         * Lambda
         ================================*/
        System.out.println();
        //另一種更簡略的形式
        ArrayList arrayList = new ArrayList<>();
        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");
        arrayList.add("D");
        arrayList.add("E");
        //只有一個參數時
        arrayList.forEach(
                System.out::print
        );


    }
}
