package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * 從Collection層面而言，從集合中隨機取元素是不支持的
 * 但是集合支持遍歷操作，可以通過遍歷獲取當前集合中的每一個元素
 * ===>Collection的子類是具備隨機元素的(根據指定位置獲取元素)
 * <p>
 * 集合提供了統一的遍歷方式: 迭代器遍歷(工作中基本不用 面試需要)
 * 對應方法:
 * Iterator iterator()
 * 該方法會返回一個用於遍歷當前集合元素的迭代器
 * java.util.Iterator 是迭代器接口
 * 其中定義了迭代器遍歷集合的基本操作，並且所有集合都有
 * 用於遍歷自身的實現類，無需死記名稱，統一看成Iterator的多態操作
 * 迭代器的遍歷遵循 問->取->刪 (其中刪除並非必備)
 */

public class IteratorDemo {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        c.add(32);
        c.add(0);
        c.add(14);
        c.add(0);
        c.add(25);
        c.add(0);
        c.add(63);
        c.add(0);
        c.add(12);
//        System.out.println(c);
        //獲取迭代器
        Iterator it = c.iterator();
        /**
         * boolean hasNext
         * 判斷是否有"下一個"元素可以遍歷
         * 有則返回true，反之false
         */
        while (it.hasNext()) {
            /**
             * Object next()
             * 獲取當前位置的"下一個元素"，並將迭代器光標指向下一個元素對象
             */
            Integer e = (Integer) it.next();
            System.out.print(e+"\t");
            /**
             * 集合可以放入任何類型的元素，故迭代器中需先強轉
             * 因為next方法返回值預設類型為Object
             * 我們需要依照元素類型進行強轉
             * 否則後續因應類型而生的API將無法執行
             */
            if (e.equals("0")){//推薦用equals方法而非雙等號
                /**
                 * 迭代器在遍歷的過程中，不可通過集合提供的刪除元素的方法來刪除功能
                 * 否則迭代器會拋出異常或修改異常(防止併發安全問題):ConcurrentModificationException
                 *
                 * c.remove(e);
                 *
                 * 可以改使用迭代器提供的remove()方法
                 */
                it.remove();
            }
        }


    }
}
