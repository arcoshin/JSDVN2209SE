package levelOne.stringdemo.practice.StringDemo_0;

import java.util.Arrays;
import java.util.Scanner;

public class StringAPI_I {
    public static void main(String[] args) {
        /**
         *  length()、charAt()
         */
        String str = "thinking in java 是一本好書";
        System.out.println(str.length());
        System.out.println(str.charAt(str.length() - 1));

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
         *  indexOf  lastIndexOf
         */
        System.out.println(str.indexOf("i"));//2
        System.out.println(str.indexOf("i", 3));//5
        System.out.println(str.indexOf("java"));//12
        System.out.println(str.lastIndexOf("i"));//9


        /**
         * toUpperCase();
         * toLowerCase();
         * trim();
         * startsWith();
         * endsWith();
         */
        System.out.println(str.toUpperCase());//全大寫
        System.out.println(str.toLowerCase());//全小寫
        str = " Tom ";
        System.out.println(str.trim());//消除兩端空白
        System.out.println(str.trim().startsWith("T"));//是否以 T 為開頭
        System.out.println(str.trim().endsWith("m"));//是否以 m 節尾


        /**
         *  subString()
         */
        String mail = "bjzhangpeng@tedu.cn";
        String user = mail.substring(0, 11);//subString使用下標擷取時，所取下標包頭不含尾
        System.out.println(user);
        //更靈活的寫法
        user = mail.substring(0, mail.indexOf("@"));//自動擷取@以前的數據
        System.out.println(user);
        //另一種表示方式
        str = "123456789";
        System.out.println(str.substring(0, 0 + 5));//視為"起始下標 + 擷取長度"，判讀性更高


        /**
         *  String.valueOf()
         */
        int n = 123456;
        str = String.valueOf(n);//將數據轉為String類型的方法
        System.out.println(str);


        /**
         * contains();
         * isEmpty();
         * toCharArray();
         */
        str = "OOP";
        System.out.println(str.contains("OO"));
        str = "";
        System.out.println(str.isEmpty());
        str = "thinking in java 是一本好書";
        char[] chars = str.toCharArray();//將字符串對象轉為char數組
        System.out.println(Arrays.toString(chars));


        /**====================
         * 面試題
         * 判斷是否為回文數
         * 定義為"正讀 = 反讀"
         ====================*/
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("請輸入內文......");
//        while (true) {
//            String sentence = scanner.nextLine();
//            if (sentence.equals("EXIT")) {
//                break;
//            }
//            boolean result = true;
//            char[] charArray = sentence.toCharArray();
//            for (int i = 0; i < charArray.length; i++) {
//                if (charArray[i] == charArray[charArray.length - 1 - i]) {
//                    result = true;
//                } else {
//                    result = false;
//                    break;
//                }
//            }
//            System.out.println(result);
//        }

        /**======================
         * 需求題，計算數據中的數字和
         * 程序須考慮後續性
         ======================*/
        /**
         * 提示 :
         * char z = number
         * ---->48=----->0
         * ---->49=----->1
         * ---->50=----->2
         * ---->51=----->3
         * ---->52=----->4
         * ---->53=----->5
         * ---->54=----->6
         * ---->55=----->7
         * ---->56=----->8
         * ---->57=----->9
         */
        String example = "1永遠年輕2永遠熱淚盈眶3永遠在路上4...56789";
        int sum = 0;
        char[] toCharArray = example.toCharArray();
        for (int i = 0; i < toCharArray.length; i++) {
            if (toCharArray[i] -48 >= 0 && toCharArray[i] -48 <= 9) {
                sum += toCharArray[i] - 48;
            }
        }
        System.out.println(sum);


    }
}
