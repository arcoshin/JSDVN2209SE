package collection;

import java.util.ArrayList;
import java.util.List;

/**
 * java.util.List 接口
 * List繼承自Collection，
 * 所以從Collection中定義的所有方法，List皆適用
 * 並且List是最常使用的集合，
 * 因其特點在於可以儲存重複元素並且記錄順序
 * 並且List集合提供使用者一套可以通過下標操作元素的方法(類似數組)
 * 常用的實現類:
 * java.util.ArrayList:內部使用數組實現，查詢效果更佳
 * java.util.LinkedList:內部使用鍊表實現，增刪效能較好
 * 對性能若沒有特別嚴苛的要求下，通常使用ArraysList即可
 */
public class ListDemo01 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("zs");
        list.add("ls");
        list.add("ww");
        list.add("xx");
        list.add("yy");
        System.out.println(list);

        //獲取集合中的第三元素

        /**
         * E get(int index)
         * 獲取指定下標處的元素，下標起始值同數組一樣為0
         */
        String name = list.get(2);
        System.out.println(name);

        //根據下標來遍歷元素 list.fori
        for (int i = 0; i < list.size(); i++) {
            name = list.get(i);
            System.out.print(name+"\t");
        }
        System.out.println();

        //將第四個元素替換為新元素

        /**
         * E set(int index)
         * 將給定元素設置到指定位置上，返回值為被替換的元素值
         */
        name = list.set(3,"zz");
        System.out.println("name的返回值:"+name);
        System.out.println(list);

    }

}
