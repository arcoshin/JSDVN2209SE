package collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * JAVA集合框架
 * 集合與跟組數一樣，都是用於儲存一組元素的容器，
 * 但是集合將元素的操作都封裝成方法，操作更簡便。
 * 並且集合提供了多種實現類供我們使用。(方便的代價就是用記得多)
 * java.util.Collection是所有集合的頂級接口，
 * 裡面定義的方法是所有集合都具備的功能
 * <p>
 * 集合有兩類常用的子類
 * java.util.List: 可以儲存重複元素的集合，並且記錄順序，稱為線性表
 * java.util.Set: 不可以儲存重複元素的集合
 */
public class CollectionDemo02 {
    public static void main(String[] args) {
        Collection c = new ArrayList();//聲明一個集合，集合中只能儲存引用類型(向上造型頂級父類)
        c.add(new Point(1, 0));
        c.add(new Point(3, 2));
        c.add(new Point(5, 4));
        c.add(new Point(7, 6));
        c.add(new Point(9, 8));
        /**
         * 輸出集合時，格式為:
         * [元素1.toString(),元素2.toString(),元素3.toString()......]
         */
        System.out.println(c);
        Point p = new Point(1, 0);
        System.out.println("p點" + p);
        /**
         * 判斷 集合c 中是否包含 點p
         * boolean contains(Object collection_0)
         * 判斷當前集合是否包含給定元素取決於.equals()方法
         * 引用類型的.equals比較的是內存地址無意義
         * 而此處用法，應為比較對象的屬性較為合理
         * 此時應該將Point類中的equals()方法重寫
         */
        boolean contains = c.contains(p);
        System.out.println("c中是否包含 點p?:" + contains);//重寫前false，重寫後true
        /**
         * 將集合c中的p點刪除
         * c.remove(p)
         * 也是根據equals()方法，將返回true的元素刪除
         */
        c.remove(p);//刪除集合中的p點
        System.out.println(c);


    }
}
