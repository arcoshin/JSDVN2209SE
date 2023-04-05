package reflect;

import java.lang.reflect.Method;
import java.util.Scanner;

/**
 * 類名.class獲取類是不理想的，不太靈活，所以換成較為靈活的方式
 */
public class ReflectDemo03 {
    public static void main(String[] args) throws ClassNotFoundException {
        /**
         * 可測試項目
         * java.util.ArrayList
         * java.lang.String
         * reflect.Person
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("請輸入類名:");
        String className = scanner.nextLine();
        Class cls = Class.forName(className);
        /**
         * 獲取當前類對象所表示的類自身定義的所有方法(包含私有但不包含父類繼承的方法)
         */
        Method[] methods = cls.getDeclaredMethods();
        System.out.println(cls.getSimpleName() + ":一共有" + methods.length + "個本類方法");
        for (Method method : methods) {
            System.out.println(method.getName());
        }

    }
}
