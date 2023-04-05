package levelOne.warpdemo.practice;

public class WarpDemo_1 {
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
        System.out.println(i1 == i2);//false，比較的是地址，有new必不同
        System.out.println(i1.equals(i2));//True，equals()比較的是內容(值)
        //推薦使用Integer.valueOf()，可以緩衝一個字節的內容，實現復用(-128~127)
        Integer i3 = Integer.valueOf(100);
        Integer i4 = Integer.valueOf(100);
        System.out.println(i3 == i4);//True，比較的是地址
        //String類型 -> Integer類型(內容必須純數字)
        String str = "888";
        Integer i5 = Integer.parseInt(str);
        System.out.println(i5);
        //最大值、最小值
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        double d = 3.14;
        Double d1 = Double.valueOf(d);
        Double d2 = Double.valueOf(3.14);
        System.out.println(d1 == d2);//false，沒有緩存機制，本質就是創建新對象
        //String類型 -> Double類型(內容必須純數字)
        System.out.println(Double.parseDouble("3.14"));


        /**=============================================
         *  包裝類 -> 基本類型   包裝類.基本類型valueOf()
         =============================================*/
        Integer i6 = Integer.valueOf(999);
        int n1 = i6.intValue();
        System.out.println(n1);

        Double d3 = Double.valueOf(3.14);
        double d4 = d3.doubleValue();
        System.out.println(d4);

        int n2 = d3.intValue();//本質為double 強轉 int
        System.out.println(n2);


        /**=============================================
         *  Integer實現進制轉換
         =============================================*/
        int data = 10;
        System.out.println(Integer.toBinaryString(data));//轉換為二進制
        System.out.println(Integer.toOctalString(data));//轉換為八進制
        System.out.println(Integer.toHexString(data));//轉換為16進制


        /**=============================================
         *  自動拆裝箱
         =============================================*/
        int e = 123;

        Integer e1 = e;//編譯器支持自動裝箱
        System.out.println(e1);

        int e2 = e1;//編譯器支持自動拆箱
        System.out.println(e2);


    }
}
