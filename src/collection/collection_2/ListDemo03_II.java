package collection.collection_2;

import java.util.ArrayList;
import java.util.List;

public class ListDemo03_II {
    public static void main(String[] args) {
        List list = new ArrayList();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        List sub = list.subList(3, 8);
        System.out.println(sub);

        for (int i = 0; i < sub.size(); i++) {
            /**============================
             *  多次犯錯
             =============================*/
            sub.set(i, (Integer) sub.get(i) * 10);
        }
        System.out.println(sub);
        System.out.println(list);
        sub.clear();
        System.out.println(list);

    }
}
