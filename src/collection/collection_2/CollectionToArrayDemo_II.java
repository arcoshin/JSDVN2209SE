package collection.collection_2;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionToArrayDemo_II {
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
        String[] str = c.toArray(new String[c.size()]);
        for (String s : str) {
            System.out.print(s + " ");
        }


    }
}
