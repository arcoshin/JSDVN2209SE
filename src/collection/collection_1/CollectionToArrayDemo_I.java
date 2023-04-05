package collection.collection_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class CollectionToArrayDemo_I {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList();
        c.add("A");
        c.add("B");
        c.add("C");
        c.add("D");
        c.add("E");
        String[] str = c.toArray(new String[c.size()]);//記得設定泛型或者直接強轉
        //參考String數組宣告格式 String[] s = new String[10];
        System.out.println(Arrays.toString(str));

    }
}
