package collection.collection_2;

import java.util.*;

public class SortListDemo02_II {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(new Point_II(3, 7));
        list.add(new Point_II(12, 3));
        list.add(new Point_II(2, 6));
        list.add(new Point_II(1, 19));
        list.add(new Point_II(8, 20));
        list.add(new Point_II(10, 12));

        /**===============
         * 容易記不住
         ================*/
        Collections.sort(list, new Comparator<Point_II>() {
            @Override
            public int compare(Point_II o1, Point_II o2) {
                return (o2.getY() - o1.getY());
            }
        });
        System.out.println(list);

    }

}
