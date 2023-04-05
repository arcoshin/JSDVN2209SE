package reflect;

import java.lang.reflect.Method;
import java.util.Scanner;

/**
 * 通過反射動態地調用有參方法
 */
public class ReflectDemo07 {
    public static void main(String[] args) throws Exception {
        Class cls = Class.forName("reflect.Person");
        Object o = cls.newInstance();

        //獲取要調用的方法(如果要調用有參方法，需要第一個參數是方法名，後面的參數則是調用方法的參數類型)
        Method method = cls.getMethod("dosome", String.class);

        //調用方法
        method.invoke(o, "學習java");
        method = cls.getMethod("dosome", String.class, int.class);
        method.invoke(o, "抄代碼", 5);//5次

    }
}
