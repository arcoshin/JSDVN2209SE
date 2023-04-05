package collection.collection_2;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo02_II {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        c.add(new Point_II(1,2));
        c.add(new Point_II(3,4));
        c.add(new Point_II(5,6));
        c.add(new Point_II(7,8));
        c.add(new Point_II(9,0));

        Point_II p = new Point_II(1, 2);
        System.out.println(c.contains(p));//false 引用變量比較地址無意義 =>重寫比較方法
        boolean contain = c.contains(p);//注意寫法
        System.out.println(contain);
        c.remove(p);
        System.out.println(c.contains(p));


    }
}
