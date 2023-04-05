package collection;

import java.util.ArrayList;
import java.util.List;

/**
 * List subList(int start,int end)
 * 獲取當前集合中，指定範圍的子集
 */
public class ListDemo03 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        System.out.println(list);

        //獲取子集[3-7]
        List<Integer> subList = list.subList(3, 8);//含頭不含尾
        System.out.println("子集:" + subList);//

        //將子集中每個元素擴大10倍
        for (int i = 0; i < subList.size(); i++) {
            subList.set(i, subList.get(i) * 10);//將當前元素*10並替換當前位置
        }
        System.out.println(subList);
        /**
         * 對子集的操作就是對原集合對應的元素操作
         */
        System.out.println(list);

        //清除集合中1-8這部分的內容
        list.subList(1,9).clear();
        System.out.println(list);

    }
}
