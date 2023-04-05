package collection.collection_2;

import java.util.HashMap;
import java.util.Map;

public class MapDemo01_II {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("ww", 99);
        map.put("xx", 100);
        map.put("yy", 60);
        map.put("zz", 88);
        System.out.println(map);
        map.put("xx",98);
        System.out.println(map);

        System.out.println(map.size());
        map.remove("zz");
        System.out.println(map);
        System.out.println(map.containsKey("ww"));
        System.out.println(map.containsKey("WW"));
        System.out.println(map.containsValue(99));
        System.out.println(map.containsValue("99"));

    }
}
