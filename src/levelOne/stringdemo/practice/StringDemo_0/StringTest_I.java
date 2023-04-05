package levelOne.stringdemo.practice.StringDemo_0;

public class StringTest_I {
    static final String B = "ABC";

    public static void main(String[] args) {
        /**
         * 賦值或修改字符串，本質上就是創建新的字符串
         * String為引用類型，比較的是內存地址
         */
        String a = "ABC";
        String b = "ABC";
        String c = "A" + "BC";
        System.out.println(a == b);//true
        System.out.println(B == a);//true
        System.out.println(c == a);//true

        //動態創建
        String d = new String("ABC");
        System.out.println(d == a);//false，有new必定不同地址
        String e = "A";
        String f = e + "BC";//地址後再拼接"BC"
        System.out.println(f == a);//false
    }
}
