package levelOne.regexdemo.practice;

import java.util.Scanner;

public class RegexDemo_5 {
    public static void main(String[] args) {

        //切割的方法
        String str = "abc123def4567ghi789";
        String[] split = str.split("\\d");
        System.out.println(split);

        str = "1@2@3@4@5@6";
        String[] split1 = str.split("@");
        System.out.println(split1);


        //替換的方法
        String regex = "(wr|nc|sjb|tmd)";
        String message = "tmd!你這個nc，簡直sjb";
        message = message.replaceAll(regex,"小可愛");
        System.out.println(message);

        //另一種替換
        message = "abc123def123ghi123";
        message = message.replace("123","");
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
         * 第一種 \\d{7}
         * 第二種 \\d{8}
         * 第三種 \\d{3,4}-\\d{7,8}
         * 第四種 (\\d{3,4})\\d{7,8}
         */
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("phone?");
//        while (true){
//            String line = scanner.nextLine();
//            String r = "(\\d{3,4}-|\\(\\d{3,4}\\))?\\d{7,8}";
//            if (line.equals("EXIT")){
//                System.out.println("END!!");
//                break;
//            }
//            System.out.println(line.matches(r));
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
         * 第一種 \\d{15}
         * 第二種 \\d{18}
         * 第三種 \\d{17}x
         * 第四種 \\d{17}X
         */
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("ID?");
//        while (true){
//            String line = scanner.nextLine();
//            String r = "\\d{17}[\\dxX]|\\d{15}";
//            if (line.equals("EXIT")){
//                System.out.println("END!!");
//                break;
//            }
//            System.out.println(line.matches(r));
//        }


        /**====================
         *   電子信箱正則練習
         ====================*/
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("MAIL?");
//        while (true){
//            String line = scanner.nextLine();
//            String r = "[a-zA-Z0-9_]+@[a-zA-Z0-9]+(\\.[a-zA-Z]+)+";
//            if (line.equals("EXIT")){
//                System.out.println("END!!");
//                break;
//            }
//            System.out.println(line.matches(r));
//        }


    }
}
