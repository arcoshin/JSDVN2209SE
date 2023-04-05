package collection.collection_4;
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
        Set<String> s = map.keySet();

        //Old
        Iterator it_key = s.iterator();
        while (it_key.hasNext()) {
            System.out.print(it_key.next() + "\t");
        }
        System.out.println();

        //New
        for (String s1 : s) {
            System.out.print(s1 + "\t");
        }
        System.out.println();

        //Each
        s.forEach(
                System.out::print
        );
        System.out.println();

        //Each.Lambda
        s.forEach(
                key -> System.out.print(key + "\t")
        );
        System.out.println();

        /**================================
         * 遍歷鍵值對
         ================================*/
        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        //Old
        Iterator<Map.Entry<String, Integer>> it_entry = entrySet.iterator();
        while (it_entry.hasNext()) {
            System.out.print(it_entry.next() + "\t");
        }
        System.out.println();

        //New
        for (Map.Entry<String, Integer> entry : entrySet) {
            System.out.print(entry + "\t");
        }
        System.out.println();

        //Each
        entrySet.forEach(
                System.out::print
        );
        System.out.println();

        //Each.Lambda
        entrySet.forEach(
                entry -> System.out.print(entry.getKey() + "," + entry.getValue() + "\t")
        );
        System.out.println();


        /**================================
         * 單獨遍歷value
         ================================*/
        Collection<Integer> values = map.values();
        //Old
        Iterator<Integer> it_value = values.iterator();
        while (it_value.hasNext()){
            System.out.print(it_value.next() + "\t");
        }
        System.out.println();

        //New
        for (Integer value : values) {
            System.out.print(value + "\t");
        }
        System.out.println();

        //Each
        values.forEach(
                System.out::print
        );
        System.out.println();

        //Each.Lambda
        values.forEach(
                v -> System.out.print(v + "\t")
        );


        /**================================
         * Lambda
         ================================*/

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
