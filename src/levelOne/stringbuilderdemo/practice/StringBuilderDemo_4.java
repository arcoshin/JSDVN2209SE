package levelOne.stringbuilderdemo.practice;

public class StringBuilderDemo_4 {
    public static void main(String[] args) {

        String str = "好好學習JAVA!!";
        StringBuilder builder = new StringBuilder(str);

        //追加
        builder.append("找份好工作");
        System.out.println(builder);

        //取代
        builder.replace(10,builder.length(),"加油~");
        System.out.println(builder);

        //插入
        builder.insert(10,"好好");
        System.out.println(builder);

        //刪除
        builder.delete(10,12);
        System.out.println(builder);

        //反序
        builder.reverse();
        System.out.println(builder);
        builder.reverse();

        //轉換回string對象
        str = builder.toString();
        System.out.println(str);

    }
}
