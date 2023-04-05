package note;

public class Example {
    String str = new String("good");
    char[] ch = {'a', 'b', 'c'};

    public static void main(String[] args) {
        String s = null;
        Example ex = new Example();
        ex.change(ex.str, ex.ch);
        System.out.println(ex.str + "," + ex.ch);
        System.out.println(s);
    }

    public void change(String str, char ch[]) {
        str = "test ok";
        ch[0] = 'g';
    }
}
