package collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * JDK推出時，推出了新特性: 增強型for循環，也稱為新循環
 * 新循環可以將遍歷集合與數組進行統一，但是不能替代傳統的for循環
 * for( 取出的元素賦值變量 : 遍歷的集合或數組)
 */
public class NewForDemo {
    public static void main(String[] args) {
        String[] arr = {"A", "B", "C", "D", "E"};
        //傳統型 for循環 遍歷 ===>快捷鍵 arr.fori
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            System.out.println(s);
        }
        System.out.println();
        //增強型 for循環 遍歷 ===>快捷鍵 arr.for 底層自動還原傳統型 for循環
        for (String s : arr){
            System.out.println(s);
        }
        Collection c = new ArrayList();
        c.add("a");
        c.add("b");
        c.add("c");
        c.add("d");
        c.add("e");
        System.out.println();
        //傳統型遍歷 : 使用迭代器
        //增強型 for循環 遍歷
        for (Object o : c) {//===>快捷鍵 c.for 底層自動還原成迭代器遍歷
            String e = (String) o;//迭代器中的強轉
            System.out.println(e);
        }

        /**
         * 新循環無法完全取代傳統型，因為該循環只能強迫從頭到尾進行遍歷
         * 不同於傳統型for循環可以依照需求，在指定下標進行各種遍歷
         * 結論:傳統型for循環在使用上會更靈活
         */






    }
}
