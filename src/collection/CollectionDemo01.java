package collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * JAVA集合框架
 * 集合與跟數組一樣，都是用於儲存一組元素的容器，
 * 但是集合將元素的操作都封裝成方法，操作更簡便。
 * 並且集合提供了多種實現類供我們使用。(方便的代價就是要記得多)
 * java.util.Collection是所有集合的頂級接口，
 * 裡面定義的方法是所有集合都具備的功能
 *
 * 集合有兩類常用的子類
 * java.util.List: 可以儲存重複元素的集合，並且記錄順序，稱為線性表
 * java.util.Set: 不可以儲存重複元素的集合
 */
public class CollectionDemo01 {
    public static void main(String[] args) {
        Collection c = new ArrayList();//聲明一個集合，集合中只能儲存引用類型(向上造型頂級父類)
        /**
         * add: 加
         * boolean add(E e) E為泛型 可先理解為Object
         * 向當前集合中添加一個元素，如果該元素添加成功，則true
         */
        c.add("one");
        c.add("two");
        c.add("three");
        System.out.println(c);//[one,two,three]
        /**
         * 集合只能儲存引用類型
         * 如果儲存一個數值，那麼集合會自動裝箱
         * c.add(Integer.valueOf(123))
         */
        c.add(123);
        System.out.println(c);//[one, two, three, 123]
        /**
         * int size()
         * size表示目前有幾個元素，隨用隨加
         */
        System.out.println("集合中的元素個數:"+c.size());//4
        c.add("four");
        c.add("five");
        System.out.println("集合中的元素個數:"+c.size());//6
        /**
         * boolean isEmpty
         * 判斷當前集合是否為空，當size=0則返回true
         */
        System.out.println(c.isEmpty());//false
        c.clear();//清空數組
        System.out.println("集合中的元素個數:"+c.size());//0
        System.out.println(c.isEmpty());//true




    }
}
