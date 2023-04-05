package levelOne.stringdemo.practice;


public class StringDemo_2 {
    public static void main(String[] args) {
        /**
         * length()、charAt()
         */
        String str = "Thinking in java是一本好書";
        System.out.println(str.length());
        System.out.println(str.charAt(2));

        //通過for循環打印整句話，並將"i"的個數計算出來
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i));
            if (str.charAt(i) == 'i') {
                sum++;
            }
        }
        System.out.println();
        System.out.println(sum);

        /**
         * indexOf  lastIndexOf
         */
        int start = str.indexOf('i');
        System.out.println(start);//2
        start = str.indexOf('i', 3);
        System.out.println(start);//5
        start = str.indexOf('i', 6);
        System.out.println(start);//9
        int end = str.lastIndexOf('i');
        System.out.println(end);//

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
        System.out.println(str.endsWith("M"));

        /**
         * subString()
         */
        str = "123456789";
        String str1 = str.substring(2, 2 + 5);
        System.out.println(str1);

        //更靈活的寫法
        String mail = "bjzhangpeng@tedu.cn";
        String str2 = mail.substring(0, 11);
        System.out.println(str2);

        //另一種表示方式
        String str3 = mail.substring(0, mail.indexOf('@'));
        System.out.println(str3);

        /**
         * String.valueOf()
         */
        int n = 123456789;
        String s = String.valueOf(n);
        System.out.println(s);

        /**
         * contains();
         * isEmpty();
         * toCharArray();
         */
        str = "Thinking in java是一本好書";
        System.out.println(str.contains("ii"));
        ;
        str = "";
        System.out.println(str.isEmpty());
        str = "Thinking in java是一本好書";
        char[] chars = str.toCharArray();
        System.out.println(chars);


        /**====================
         * 面試題
         * 判斷是否為回文數
         * 定義為"正讀 = 反讀"
         ====================*/
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("請輸入語句");
//        boolean result = false;
//        while (true) {
//            String line = scanner.nextLine();
//            if (line.equals("EXIT")) {
//                break;
//            }
//            char[] charLine = line.toCharArray();
//            for (int j = 0; j < charLine.length; j++) {
//                if (charLine[j] == charLine[charLine.length - 1 - j]){
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
        char[] charEX = example.toCharArray();
        int sumEX = 0;
        for (int k = 0; k < charEX.length; k++) {
            if (charEX[k] >= 48 && charEX[k] <= 57){
                sumEX += charEX[k] -48;
            }
        }
        System.out.println(sumEX);
        char z = 48;//0
        System.out.println(z);

        /**
         * 賦值或修改字符串，本質上就是創建新的字符串
         * String為引用類型，比較的是內存地址
         */
        String a = "ABC";
        String b = "ABC";
        String c = "A"+"BC";
        System.out.println(a == b);//比較的是地址
        System.out.println(a == A);//比較的是地址
        System.out.println(a == c);//比較的是地址

        //動態創建、含拼接
        String d = new String("ABC");
        String e = "A";
        String f = e + "BC";
        System.out.println(a == d);
        System.out.println(a == f);
    }
    private static final String A = "ABC";
}
