package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 數組轉換為List集合
 * 數組工具類Arrays提供了一個靜態方法asList
 * 該方法可將數組轉換為集合
 */
public class ArrayToListDemo {
    public static void main(String[] args) {
        String[] array = {"A", "B", "C", "D", "E"};
        System.out.println("數組:" + Arrays.toString(array));
        List<String> list = Arrays.asList(array);
        System.out.println("集合:" + list);

        //特別注意 : 對該集合的操作就是對原有數組的操作
        list.set(1,"F");//修改集合數值
        System.out.println("修改後新集合:"+list);
        System.out.println("修改後新數組:"+Arrays.toString(array));//可發現跟著改變了

//        list.add("G");//增刪集合個數
//        System.out.println("集合:"+list);
        /**
         * 報錯 java.lang.UnsupportedOperationException
         * 不支持的操作異常
         *

        /**========================================
         * 方案一
         * 如果對這個集合有增刪需求，
         * 需先創立另一外一個新的集合
         * 並傳入原集合所有元素
         * 新集合即可進行這些功能
         ========================================*/
        List<String> list1 = new ArrayList<>();
        list1.addAll(list);
        System.out.println("第一方案新集合:"+list1);



        /**========================================
         * 方案二
         * 所有集合都支持一個參數Collection的構造器
         * 目標是創建集合時，同時將給定集合中的所有元素導入
         ========================================*/
        List<String> list2 = new ArrayList<>(list);
        list1.addAll(list);
        System.out.println("第二方案新集合:"+list2);

        list1.add("G");
        System.out.println("集合:"+list);
        System.out.println("方案後新集合:"+list1);
    }
}
