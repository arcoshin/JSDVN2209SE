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
public class CollectionDemo03 {
    public static void main(String[] args) {
        Collection c = new ArrayList();//聲明一個集合，集合中只能儲存引用類型(向上造型頂級父類)
        Point p = new Point(1, 2);
        c.add(p);
        System.out.println(c);
        p.setX(3);
        System.out.println(c);


    }
}
