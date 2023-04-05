package levelOne.stringbuilderdemo.practice;

public class StringBuilderDemo_5 {
    public static void main(String[] args) {

        String str = "好好學習JAVA!!";
        StringBuilder builder = new StringBuilder(str);

        //追加
        builder.append("加油!!");
        System.out.println(builder);

        //取代
        builder.replace(9,10,"好好");
        System.out.println(builder);

        //插入
        builder.insert(9,"!");
        System.out.println(builder);

        //刪除
        builder.delete(9,builder.length());
        System.out.println(builder);

        //反序
        System.out.println(builder.reverse());
        builder.reverse();

        //轉換回string對象
        System.out.println(builder.toString());

    }
}
