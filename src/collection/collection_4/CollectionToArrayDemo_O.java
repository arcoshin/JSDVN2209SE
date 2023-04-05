package collection.collection_4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class CollectionToArrayDemo_O {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList();
        c.add("ASD");
        c.add("BDF");
        c.add("CVB");
        c.add("DFG");
        c.add("ERT");

        /**=====================
         * 容易記錯
         =====================*/
        String[] arr = c.toArray(new String[c.size()]);
        System.out.println(Arrays.toString(arr));
        System.out.println(c);
        arr[0] = "0";
        System.out.println(Arrays.toString(arr));
        System.out.println(c);



    }
}
