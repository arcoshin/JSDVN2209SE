package levelOne.warpdemo.practice;

public class WarpDemo_3 {
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
        System.out.println(i1 == i2);//F
        System.out.println(i1.equals(i2));//T

        //推薦使用...，可以緩衝一個字節的內容，實現復用
        Integer i3 = Integer.valueOf(100);
        Integer i4 = Integer.valueOf(a);
        System.out.println(i3.equals(i4));
        System.out.println(i3.equals(i1));

        //String類型 -> Integer類型(內容必須純數字)
        String str = "123456789";
        int i5 = Integer.parseInt(str);
        System.out.println(i5);

        //最大值、最小值
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        //double沒有緩存機制，本質就是創建新對象
        double pi = 3.14;
        Double d1 = Double.valueOf(pi);
        Double d2 = Double.valueOf(3.14);
        System.out.println(d1 == d2);

        //String類型 -> Double類型(內容必須純數字)
        str = "3.14";
        double d3 = Double.parseDouble(str);
        System.out.println(d3);

        /**=============================================
         *  包裝類 -> 基本類型   包裝類.基本類型valueOf()
         =============================================*/
        //int、double、交互
        Integer i6 = Integer.valueOf("123");
        int i7 = i6.intValue();
        System.out.println(i7);

        Double d4 = Double.valueOf("3.1415926");
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
        int e1 = e;
        System.out.println(e1);
        //編譯器支持自動拆箱
        Integer e2 = e1;
        System.out.println(e2);


    }
}
