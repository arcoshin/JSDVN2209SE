package collection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo04 {
    public static void main(String[] args) {
        Collection c1 = new ArrayList();
        c1.add("dog");
        c1.add("cat");
        c1.add("sheep");
        System.out.println("c1集合:" + c1);//c1集合:[dog, cat, sheep]

        Collection c2 = new ArrayList();
        c2.add("tiger");
        c2.add("pig");
        c2.add("fox");
        System.out.println("c2集合:" + c2);//c2集合:[tiger, pig, fox]

        /**
         * 將集合c2所有元素加到集合c1中
         * boolean addAll(Collection C)
         * 添加集合C至當前集合中
         * 操作完成後，返回true
         */
        c1.addAll(c2);
        System.out.println("c1集合:" + c1);//[dog, cat, sheep, tiger, pig, fox]
        System.out.println("c2集合:" + c2);//[tiger, pig, fox]

        Collection c3 = new ArrayList();
        c3.add("pig");
        c3.add("dog");//重複於c1的元素
        c3.add("fish");//重複於c2的元素
        System.out.println("c3集合:" + c3);
        /**
         * 判斷c1集合是否包含c3中的所有元素
         * containsAll(Collection C)
         * 判斷當前集合是否包含給定集合中的所有元素
         */
        System.out.println("c1是否包含c3:" + c1.containsAll(c3));//false
        /**
         * 將c1對c3取交集
         * 但是c3本體元素不受影響
         */
        c1.retainAll(c3);
        System.out.println("c1集合:" + c1);//[dog, pig]
        System.out.println("c3集合:" + c3);//[pig, dog, fish]
        /**
         * c1對c3刪除交集
         * 但是c3本體元素不受影響
         */
        c1.add("chicken");
        c1.removeAll(c3);
        System.out.println("c1集合:" + c1);//[chicken]
        System.out.println("c3集合:" + c3);//[pig, dog, fish]







    }
}
