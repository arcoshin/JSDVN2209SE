package collection;

import java.util.*;

/**
 * 集合的排序
 * 集合工具類:java.util.Collections
 * 其中提供了一個靜態方法sort
 * 可以讓List集合逕行自然排序
 */
public class SortListDemo01 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        //隨機數生成器
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            //向集合中儲存一個隨機100以內的整數
            list.add(random.nextInt(100));
        }
        System.out.println("排序前" + list);
        //對集合內容進行自然排序(由小到大)
        Collections.sort(list);
        System.out.println("排序後" + list);
        //翻轉集合順序(由大到小)
        Collections.reverse(list);
        System.out.println("翻轉後" + list);




    }
}
