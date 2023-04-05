package levelOne.stringdemo.practice;

import java.util.Scanner;

public class StringDemo_3 {
    public static void main(String[] args) {
        /**
         * length()、charAt()
         */
        String str = "Thinking in java是一本好書";
        System.out.println(str.length());
        System.out.println(str.charAt(2));

        //通過for循環打印整句話，並將"i"的個數計算出來
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i));
            if (str.charAt(i) == 'i') {
                count++;
            }
        }
        System.out.println();
        System.out.println(count);

        /**
         * indexOf  lastIndexOf
         */
        System.out.println(str.indexOf("i"));//3
        System.out.println(str.indexOf("i", 3));//5
        System.out.println(str.indexOf("i", 6));//9

        System.out.println(str.lastIndexOf("i"));//9
        System.out.println(str.lastIndexOf("i", 8));//5

        /**
         * toUpperCase();
         * toLowerCase();
         * trim();
         * startsWith();
         * endsWith();
         */
        String name = " Tom ";
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.trim());
        System.out.println(str.startsWith("T"));
        System.out.println(str.endsWith("M"));

        /**
         * subString()
         */
        str = "123456789";
        String sub = str.substring(2, 7);
        System.out.println(sub);

        //更靈活的寫法
        String mail = "bjzhangpeng@tedu.cn";
        String sub1 = mail.substring(0, 11);
        System.out.println(sub1);

        //另一種表示方式
        String substring = mail.substring(0, mail.lastIndexOf("@"));
        System.out.println(substring);

        /**
         * String.valueOf()
         */
        int n = 100;
        String.valueOf(n);
        System.out.println(n);

        /**
         * contains();
         * isEmpty();
         * toCharArray();
         */
        str = "Thinking in java是一本好書";

        System.out.println(str.contains("oo"));
        System.out.println(str.contains("i"));
        char[] ch = str.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            System.out.print(ch[i]);
        }

        str = "";
        System.out.println(str.isEmpty());

        /**====================
         * 面試題
         * 判斷是否為回文數
         * 定義為"正讀 = 反讀"
         ====================*/
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("請輸入語句......");
//        while (true) {
//            String line = scanner.nextLine();
//            if (line.equals("EXIT")) {
//                System.out.println("程序已結束");
//                break;
//            }
//            boolean result = false;
//            char[] chars = line.toCharArray();
//            for (int i = 0; i < chars.length; i++) {
//                if (chars[i] == chars[chars.length - 1 - i]){
//                    result = true;
//                } else {
//                    result = false;
//                }
//            }
//            System.out.println(result);
//
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

        char x = 48;
        char y = 57;
        System.out.println(x);//0
        System.out.println(y);//*

        char[] chars = example.toCharArray();
        int sum = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= 48 && chars[i] <= 57) {
                sum += chars[i] - 48;
            }
            System.out.println(sum);

        }


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

    }

    private final static String A = "ABC";
}
