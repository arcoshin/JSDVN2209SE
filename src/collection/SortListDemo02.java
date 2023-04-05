package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 自定義排序
 */
public class SortListDemo02 {
    public static void main(String[] args) {
        List<Point> list = new ArrayList<>();
        list.add(new Point(3, 7));
        list.add(new Point(12, 3));
        list.add(new Point(2, 6));
        list.add(new Point(1, 19));
        list.add(new Point(8, 20));
        list.add(new Point(10, 12));
        System.out.println("排序前:" + list);
        System.out.println();
        /**
         * Collections.sort(List list)在排序List集合時
         * 需要集合中的元素實現一個Comparable接口
         * 實現Comparable接口的類，需要重寫一個CompareTo方法
         * 這個方法就是自定義排序規則的地方
         * 否則sort不知道如何進行排序，就會編譯不通過
         * 像這種在類內部規則的比較規則稱為內部比較器，
         * 但因其具有侵入性，不適合規則經常發生的對象。
         * 侵入性:會更改原代碼的功能，不利後續代碼維護。===>極度不建議使用
         */
//        Collections.sort(list);//無接口無定義方法，會直接報錯


        /**
         * 所以如果需要臨時對某個類定義比較規則，可以臨時創建外部比較器
         * 由於該比較規則的定義位置在當前類，所以不具侵入性，推薦使用
         * 創建Comparator的匿名內部類，重寫Compare方法
         * 定義比較器實例並回傳給sort方法
         * public int compare(Object o1, Object o2) {}
         * 比較結果有三種: 等於 小於 大於
         * 如果需要遞增排列 : o1-o2；
         * 如果需要遞減排列 : o2-o1；
         * 如果o1大於o2則返回正整數，o1-o2>0;
         * 如果o1等於o2則返回零，o1-o2=0;
         * 如果o1小於o2則返回負整數，o1-o2<0;
         */
        Collections.sort(list, new Comparator<Point>() {
            //定義比較規則
            @Override
            public int compare(Point o1, Point o2) {
                return o1.getX() - o2.getX();
            }
        });
        System.out.println("自定義排序後:" + list);


    }
}
