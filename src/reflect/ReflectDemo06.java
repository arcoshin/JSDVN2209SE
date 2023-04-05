package reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Scanner;

/**
 * 通過反射動態地調用無參方法
 */
public class ReflectDemo06 {
    public static void main(String[] args) throws Exception {
        Person p = new Person();
        p.sayGoodBye();

        Scanner scanner = new Scanner(System.in);//reflect.Student
        System.out.println("請輸入類名");
        String classname = scanner.nextLine();
        System.out.println("請輸入方法名");
        String methodName = scanner.nextLine();

        //1.實例化對象
        Class cls = Class.forName(classname);
        Object o = cls.newInstance();

        //2.獲取要調用的方法(只寫一個方法名，調用的是無參方法)
        Method method = cls.getMethod(methodName);

        //3.調用方法(是通過對象來執行invoke()方法，來實現對象調用方法)
        method.invoke(o);

    }
}
