package levelOne.regexdemo.practice;

import java.util.Arrays;
import java.util.Scanner;

public class RegexDemo_1 {
    public static void main(String[] args) {

        //切割的方法
        String str = "abc123def4567ghi789";
        String[] s = str.split("\\d+");//"+" 一次或多次
        System.out.println(Arrays.toString(s));//[abc, def, ghi]
        str = "1@2@3@4@5@6";
        s = str.split("@");
        System.out.println(Arrays.toString(s));//[1, 2, 3, 4, 5, 6]

        //替換的方法
        String regex = "(wr|nc|sjb|tmd)";
        String message = "tmd!你這個nc，簡直sjb";
        /**
         * replaceAll() 支持正則
         */
        message = message.replaceAll(regex, "小可愛");
        System.out.println(message);
        /**
         * replace() 不支持正則 : 字串換字串
         */
        message = "abc123def123ghi123";
        message = message.replace("123", "");//abcdefghi
        System.out.println(message);

        /**====================
         *   座機號碼正則練習
         ====================*/

        /**
         * 1234567  7 位
         * 12345678 8 位
         * 010-     1234567     區號3位-7位電話
         * 010-     12345678    區號3位-8位電話
         * 0101-    1234567     區號4位-7位電話
         * 0101-    12345678    區號4位-8位電話
         * (010)    1234567     (區號3位)7位電話
         * (010)    12345678    (區號3位)8位電話
         * (0101)   1234567     (區號4位)7位電話
         * (0101)   12345678    (區號4位)8位電話
         */

        /**
         * 分析:
         * 第一種 \d{7}
         * 第二種 \d{8}
         * 第三種 \d{3,4}-
         * 第四種 (\d{3,4})
         */


        /**
         * 內部的"()"及"\"皆有原始意義，須使用\轉義，
         * 而成為了"\\("、"\\)"、"\\" ......(雙重\\才能轉義)
         */

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Entering the number......");
//        while (true){
//            String p = scanner.nextLine();
//            String phoneRule = "(\\d{3,4}-|\\(\\d{3,4}\\))?\\d{7,8}";
//            if (p.equals("EXIT")){
//                break;
//            }
//            System.out.println(p.matches(phoneRule));
//        }

        /**====================
         * 中國身分證規則正則練習
         ====================*/

        /**
         *123456789012345       15位數字
         *123456789012345678    18位數字
         *12345678901234567x    17位數字 18位小寫x
         *12345678901234567X    17位數字 18位大寫X
         */

        /**
         * 分析:
         * 第一種 \d{15}
         * 第二種 \d{18}
         * 第三種 \d{17}x
         * 第四種 \d{17}X
         */

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Entering the ID ......");
//        while (true) {
//            String ID = scanner.nextLine();
//            String IDRule = "(\\d{15}|\\d{17}[\\dxX])";
//            if (ID.equals("EXIT")) {
//                break;
//            }
//            System.out.println(ID.matches(IDRule));
//        }


        /**====================
         *   電子信箱正則練習
         ====================*/
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Entering your E-mail ......");
//        while (true){
//            String e = scanner.nextLine();
//            String emailRule = "[a-zA-Z0-9_]+@[a-zA-Z0-9]+(\\.[a-zA-Z]+)+";
//            if (e.equals("EXIT")){
//                break;
//            }
//            System.out.println(e.matches(emailRule));
//        }

//        String testRule = "[a-zA-Z0-9_]{3,}";//雖然可讀性很差，但不可隨意空格
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Entering......");
//        while (true){
//            String t = scanner.nextLine();
//            if (t.equals("EXIT")){
//                break;
//            }
//            System.out.println(t.matches(testRule));
//        }


    }
}
