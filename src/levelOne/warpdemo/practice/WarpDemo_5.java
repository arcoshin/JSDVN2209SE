package levelOne.warpdemo.practice;

public class WarpDemo_5 {
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
        Integer i1 = new Integer(100);
        Integer i2 = new Integer(a);
        System.out.println(i1 == i2);
        System.out.println(i1.equals(i2));
        //推薦使用...，可以緩衝一個字節的內容，實現復用
        Integer i3 = Integer.valueOf(a);
        Integer i4 = Integer.valueOf(100);
        System.out.println(i3 == i4);
        System.out.println(i3.equals(i4));

        //String類型 -> Integer類型(內容必須純數字)
        String num = "99999";
        int i5 = Integer.parseInt(num);
        System.out.println(i5 + 1);

        //最大值、最小值
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        //double沒有緩存機制，本質就是創建新對象
        double pi = 3.14;
        Double d1 = Double.valueOf(pi);
        Double d2 = Double.valueOf(3.14);
        System.out.println(d1 == d2);

        //String類型 -> Double類型(內容必須純數字)
        String prize = "199.99";
        double d3 = Double.parseDouble(prize);
        System.out.println(d3 + 0.01);


        /**=============================================
         *  包裝類 -> 基本類型   包裝類.基本類型valueOf()
         =============================================*/
        //int、double、交互
        Integer i6 = new Integer(9999);
        int i7 = i6.intValue();
        System.out.println(i7);

        Double d4 = new Double(3.14);
        double d5 = d4.doubleValue();
        System.out.println(d5);
        int i8 = d4.intValue();
        System.out.println(i8);


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
        System.out.println(e1);

        //編譯器支持自動拆箱
        int e2 = e1;
        System.out.println(e2);


    }
}
