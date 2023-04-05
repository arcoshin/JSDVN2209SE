package collection;

import java.util.HashMap;
import java.util.Map;

/**
 * java.util.Map 接口 查找表
 * Map體現的結構就是多行兩列的表格，其中左列為key，右列為value
 * Map總是以key-value的形式保存一組數據，並且可以根據key獲取對應的value
 * key-value也稱為鍵值對，Map中有要求key不得重複，但value可以
 *
 * 常用的實現類:
 * java.util.HashMap 我們稱為散列表，是當今查詢速度最快的數據結構
 */
public class MapDemo01 {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap();//若要使用泛型，需要指定兩個類型才能導入，如<String,Integer>
        /**
         * put(K k,V v)
         * 向當前map保存一組鍵值對
         */
        map.put("國文",99);
        map.put("英文",60);
        map.put("數學",100);
        map.put("自然",99);
        map.put("社會",75);
        System.out.println(map);
        map.put("英文",90);
        System.out.println(map);
        /**
         * get(K k)
         * 利用key向當前map查詢value值
         */
        Integer score = map.get("英文");
        System.out.println(score);
        /**
         * map.size()查詢鍵值對對數
         */
        System.out.println("map儲存的鍵值對數量" + map.size());
        /**
         * map.remove()刪除key對應的整組鍵值對，並將key作為返回值返回
         */
        score = map.remove("國文");
        System.out.println(map);
        System.out.println(score);
        /**
         * 判定是否包含某元素key&value
         * map.containsKey()
         * map.containsValue()
         */
        boolean dd = map.containsKey("自然");
        System.out.println("包含key: " + dd);
        boolean ff = map.containsValue(99);
        System.out.println("包含value: " + ff);
    }
}
