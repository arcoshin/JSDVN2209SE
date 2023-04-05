package collection.collection_1;

import java.util.HashMap;
import java.util.Map;

public class MapDemo01_I {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("國文",99);
        map.put("英文",60);
        map.put("數學",100);
        map.put("自然",88);
        map.put("社會",75);
        System.out.println(map);
        map.put("英文",87);
        System.out.println(map);

        System.out.println(map.get("數學"));

        System.out.println(map.size());
        map.remove("社會");
        System.out.println(map);
        System.out.println(map.size());

        System.out.println(map.containsKey("社會"));
        System.out.println(map.containsValue(100));


    }
}
