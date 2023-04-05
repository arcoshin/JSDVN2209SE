package reflect;

import java.lang.reflect.Constructor;
import java.util.Scanner;

/**
 * 通過反射動態地實例化含參對象
 */
public class ReflectDemo05 {
    public static void main(String[] args) throws Exception {
        Person p = new Person("ZS", 18);

        //1.加載類對象
        Class cls = Class.forName("reflect.Person");

        //2.獲取將調用的構造器(需要傳入對應的參數類型的Class對象)---Public Person(String name, int age){}
        Constructor c = cls.getConstructor(String.class, int.class);

        //3.通過該構造器實例化對象，將參數通過newInstance方法傳入到該構造器中
        Object o = c.newInstance("zs", 18);
        System.out.println(o);
    }
}
