package reflect;

/**
 * 簡單了解java新特性，變長參數
 * 語法: test(類型... 參數名)
 * java的可變長參數本質上就是一個動態創建的數組，可以把參數當成一個數組
 * 但是一個方法只能有一個可變長參數，並且這個參數必須在最後一位。
 */
public class Test01 {
    public static void main(String[] args) {
        test(1);
        test(1,2);
        test(1,2,3);
        test(1,2,3,4);
        test(1,2,3,4,5);
        test(1,2,3,4,5,6);
    }

    public static void test(int... a) {
        for (int i : a) {
            System.out.print(i);
        }
        System.out.println();
    }



}
