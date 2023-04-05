package collection;

import java.util.*;

/**
 * Map支持的遍歷
 * 1.單獨遍歷key
 * 2.遍歷每一組鍵值對
 * 3.單獨遍歷value(不常用)
 */
public class MapDemo02 {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap();
        map.put("國文",99);
        map.put("英文",60);
        map.put("數學",100);
        map.put("自然",99);
        map.put("社會",75);
        map.put("體育",1000);
        System.out.println(map);
        /**
         * 1.單獨遍歷key
         * map.ketSet()，該方法可將所有key以set集合的方式返回
         * key不可重複，set集合也不可重複，故以此調用方法
         */
        Set<String> keySet = map.keySet();
        for (String key : keySet) {
            System.out.println("key:" + key);
        }

        /**
         * 2.遍歷每一組鍵值對
         * 需要當前Map調用entrySet() Map中的每一組鍵值對其實都是由entry所包裹的
         * 通過該方法，可以將每一組鍵值對，都以一個Entry實例的形式，存儲到Set集合中
         */
        Set<Map.Entry<String,Integer>> entrySet = map.entrySet();
        for (Map.Entry<String,Integer> entry: entrySet) {
            System.out.println("key:" + entry.getKey() + ",value:" + entry.getValue());
        }

        /**
         * 3.單獨遍歷value
         */
        Collection<Integer> values = map.values();
        for (Integer value : values) {
            System.out.println("value:" + value);
        }

        /**
         * 4.JDK8後，集合和Map都支持了基於Lambda表達式形式遍歷
         */
        map.forEach(
                (k,v) -> System.out.println(k + ":" + v)
        );
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        list.forEach(
                //(e) -> System.out.println(e)
                // e -> System.out.println(e)
                System.out::println
        );



    }
}
