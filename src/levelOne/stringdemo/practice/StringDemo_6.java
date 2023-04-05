package levelOne.stringdemo.practice;

import java.util.Scanner;

public class StringDemo_6 {
    public static void main(String[] args) {
        /**
         * length()、charAt()
         */
        String str = "Thinking in java是一本好書";
        System.out.println(str.length());
        System.out.println(str.charAt(3));

        //通過for循環打印整句話，並將"i"的個數計算出來
        char[] ch1 = str.toCharArray();
        int sum = 0;
        for (char c : ch1) {
            System.out.print(c);
            if (c == 'i') {
                sum += 1;
            }
        }
        System.out.println();
        System.out.println(sum);

        /**
         * indexOf  lastIndexOf
         */
        System.out.println(str.indexOf("i"));
        System.out.println(str.indexOf("i", 3));
        System.out.println(str.indexOf("i", 6));
        System.out.println(str.lastIndexOf("i"));//9

        /**
         * toUpperCase();
         * toLowerCase();
         * trim();
         * startsWith();
         * endsWith();
         */
        str = " Tom ";
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        System.out.println(str.trim());
        System.out.println(str.startsWith("t"));
        System.out.println(str.endsWith(" "));

        /**
         * subString()
         */
        str = "123456789";
        String subs = str.substring(2, 2 + 5);
        System.out.println(subs);

        //更靈活的寫法
        String mail = "bjzhangpeng@tedu.cn";
        String substring = mail.substring(0, mail.indexOf("@"));
        System.out.println(substring);

        /**
         * String.valueOf()
         */
        int number = 123456789;
        String s = String.valueOf(number);
        System.out.println(s + 1);


        /**
         * contains();
         * isEmpty();
         * toCharArray();
         */
        str = "Thinking in java是一本好書";
        System.out.println(str.contains("i"));
        char[] ch2 = str.toCharArray();
        for (char c : ch2) {
            System.out.print(c);
        }
        System.out.println();
        str = "";
        System.out.println(str.isEmpty());


        /**====================
         * 面試題
         * 判斷是否為回文數
         * 定義為"正讀 = 反讀"
         ====================*/
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Line?");
//        boolean result = false;
//        while (true) {
//            String line = scanner.nextLine();
//            char[] chs = line.toCharArray();
//            for (int i = 0; i < chs.length; i++) {
//                if (chs[i] == chs[chs.length - 1 - i]){
//                    result = true;
//                } else {
//                    result = false;
//                }
//            }
//            System.out.println(result);
//        }


        /**======================
         * 需求題，計算數據中的數字和
         * 程序須考慮後續性
         *
         * 提示 :
         * char z = number
         * ---->48=----->0
         * ---->57=----->9
         ======================*/
        String example = "1永遠年輕2永遠熱淚盈眶3永遠在路上4...56789";
        char[] chars = example.toCharArray();
//        char x = 48;
//        char y = 57;
//        System.out.println(x + "," + y);
        sum = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= 48 && chars[i] <= 57) {
                sum += chars[i] - 48;
            }
        }
        System.out.println(sum);


        /**
         * 賦值或修改字符串，本質上就是創建新的字符串
         * String為引用類型，比較的是內存地址
         */
        String a = "ABC";
        String b = "ABC";
        String c = "A" + "BC";
        System.out.println(a == b);
        System.out.println(a == c);
        System.out.println(a == A);

        //動態創建、含拼接
        String d = new String("ABC");
        String e = "A";
        String f = e + "BC";
        System.out.println(a == d);
        System.out.println(a == f);
        System.out.println(a.equals(d));
        System.out.println(a.equals(f));


    }

    private static final String A = "ABC";
}
