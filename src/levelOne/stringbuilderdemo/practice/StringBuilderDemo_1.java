package levelOne.stringbuilderdemo.practice;

public class StringBuilderDemo_1 {
    public static void main(String[] args) {

        String str = "好好學習JAVA";
        StringBuilder builder = new StringBuilder(str);

        //追加
        builder.append("，為了找份好工作!");
        System.out.println(builder);

        //取代
        builder.replace(11,builder.length(),"拯救世界!");
        System.out.println(builder);

        //插入
        builder.insert(16,"加油~");
        System.out.println(builder);

        //刪除
        builder.delete(16,builder.length());
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
