package collection.collection_1;

import java.util.*;

public class SortListDemo02_I {
    public static void main(String[] args) {
        Random random = new Random();
        List list = new ArrayList();
        for (int i = 0; i < 6; i++) {
            int x = random.nextInt(20);
            int y = random.nextInt(20);
            list.add(new Point(x, y));
        }
        System.out.println(list);
        Collections.sort(list, new Comparator<Point>() {
            @Override
            public int compare(Point o1, Point o2) {
                return (o1.getX() + o1.getY()) - (o2.getX() + o2.getY());
            }
        });
        System.out.println(list);

    }
}
