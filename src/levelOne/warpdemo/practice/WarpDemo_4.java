package levelOne.warpdemo.practice;

public class WarpDemo_4 {
    public static void main(String[] args) {
        /**
         *  基本類型       包裝類
         *  byte          Byte
         *  short         Short
         *  int           Integer
         *  long          Long
         *  float         Float
         *  double        Double
         *  boolean       Boolean
         *  chat          Character
         */

        /**============================
         *  基本類型  => 引用類型(包裝類)
         ============================*/
        //基本使用
        int a = 100;
        Integer i1 = new Integer(a);
        Integer i2 = new Integer(100);
        System.out.println(i1 == i2);
        System.out.println(i1.equals(i2));
        //推薦使用...，可以緩衝一個字節的內容，實現復用
        Integer i3 = Integer.valueOf(a);
        Integer i4 = Integer.valueOf(100);
        System.out.println(i3 == i4);

        //String類型 -> Integer類型(內容必須純數字)
        String number = "123456789";
        int num = Integer.parseInt(number);
        System.out.println(num + 1);

        //最大值、最小值
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        //double沒有緩存機制，本質就是創建新對象
        double pi = 3.14;
        Double d1 = Double.valueOf(3.14);
        Double d2 = Double.valueOf(pi);
        System.out.println(d1 == d2);

        //String類型 -> Double類型(內容必須純數字)
        String std = "3.1415926";
        Double.parseDouble(std);

        /**=============================================
         *  包裝類 -> 基本類型   包裝類.基本類型valueOf()
         =============================================*/
        //int、double、交互
        Integer i5 = new Integer(123);
        int i6 = i5.intValue();
        System.out.println(i6);

        Double d3 = new Double(3.9999);
        double d4 = d3.doubleValue();
        System.out.println(d4);
        int i7 = d3.intValue();
        System.out.println(i7);

        /**=============================================
         *  Integer實現進制轉換
         =============================================*/
        int data = 10;
        //轉換為二進制
        System.out.println(Integer.toBinaryString(data));

        //轉換為八進制
        System.out.println(Integer.toOctalString(data));

        //轉換為16進制
        System.out.println(Integer.toHexString(data));


        /**=============================================
         *  自動拆裝箱
         =============================================*/
        int e = 123;

        //編譯器支持自動裝箱
        Integer e1 = e;

        //編譯器支持自動拆箱
        int e2 = e1;


    }
}
