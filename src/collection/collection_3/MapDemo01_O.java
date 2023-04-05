package collection.collection_3;

import java.util.HashMap;
import java.util.Map;

/**
 * 創建鍵值對5組，重複聲明修改數值
 * 取集合長度、從key刪除值、鍵與值是否包含的方法
 */

public class MapDemo01_O {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("A",100);
        map.put("B",90);
        map.put("C",80);
        map.put("D",70);
        map.put("E",60);
        map.put("F",50);
        map.put("F",59);
        System.out.println(map);
        System.out.println(map.size());
        map.remove("F");
        System.out.println(map);

        System.out.println(map.containsKey("A"));
        System.out.println(map.containsValue("100"));
    }
}
