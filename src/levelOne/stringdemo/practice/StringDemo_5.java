package levelOne.stringdemo.practice;

import java.util.Arrays;
import java.util.Scanner;

public class StringDemo_5 {
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
        System.out.println(str.indexOf("i"));
        System.out.println(str.indexOf("i", 4));
        System.out.println(str.indexOf("i", 8));
        System.out.println(str.lastIndexOf("i"));

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
        System.out.println(str.startsWith("T"));
        System.out.println(str.endsWith(" "));

        /**
         * subString()
         */
        String lr = "123456789";
        System.out.println(lr.substring(2, 7));

        //更靈活的寫法
        String mail = "bjzhangpeng@tedu.cn";
        System.out.println(mail.substring(0, 11));

        //另一種表示方式
        String substring = mail.substring(0, mail.lastIndexOf("@"));
        System.out.println(substring);

        /**
         * String.valueOf()
         */
        int num = 123456789;
        String s = String.valueOf(num);
        System.out.println(s);

        /**
         * contains();
         * isEmpty();
         * toCharArray();
         */
        str = "Thinking in java是一本好書";
        System.out.println(str.contains("i"));
        System.out.println(str.contains("ii"));
        char[] chars = str.toCharArray();
        System.out.println(Arrays.toString(chars));
        str = "";
        System.out.println(str.isEmpty());

        /**====================
         * 面試題
         * 判斷是否為回文數
         * 定義為"正讀 = 反讀"
         ====================*/
//        Scanner scanner = new Scanner(System.in);
//        boolean result = false;
//        System.out.println("請輸入語句");
//        while (true){
//            String line = scanner.nextLine();
//            char[] cr1 = line.toCharArray();
//            for (int i = 0; i < cr1.length; i++) {
//                if (cr1[i] == cr1[cr1.length - 1 -i]){
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
        char x = 48;
        System.out.println(x);//0
        char y = 57;
        System.out.println(y);//9

        char[] c1 = example.toCharArray();
        int sum = 0;
        for (int i = 0; i < c1.length; i++) {
            if (c1[i] >= 48 && c1[i] <= 57) {
                sum += c1[i] - 48;
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


    }

    private static final String A = "ABC";
}
