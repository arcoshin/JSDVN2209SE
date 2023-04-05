package collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 泛型
 * JDK5推出的新特性，提供編譯時的安全監測機制
 * 允許程序員在編譯時監測到非法的類型
 * 泛型本身為參數化類型，即 給類型指定一個參數，在使用時再決定參數具體的值
 */
public class GenericsDemo {
    public static void main(String[] args) {
        //沒有聲明泛型的集合，集合可以裝載任何類型的元素
        Collection c = new ArrayList();
        c.add(1);
        c.add(true);
        c.add("hello");
        c.add(new Object());
        System.out.println(c);

        /**
         * 在聲明集合時，指定泛型，可以保證元素存入集合時的安全性
         * 否則類型不統一，容易影響後續任何對於元素的操作
         * 也可省去包裝類的裝拆箱
         * 增強型for循環也會根據泛型來生成對應的形參
         */
        Collection<Integer> c1 = new ArrayList();
//        c1.add(true);//限定存入類型為Integer
        c1.add(1);

        Collection<String> c2 = new ArrayList();
//        c2.add(1);//限定存入類型為String
        c2.add("hello");

        /**
         *  Collection<String> c3 = new ArrayList<String>();
         *  泛型最先推出時左右都須寫上泛型
         *  經過意見反應不便性，故而允許右邊留空
         *  Collection<String> c3 = new ArrayList<>();
         *  現行改版為左側聲明，若僅聲明泛型於右側則 不生效 但也 不報錯
         *  Collection<> c3 = new ArrayList<String>();//不報錯也不生效
         *  Collection<String> c3 = new ArrayList();//現行寫法
         */

    }
}
