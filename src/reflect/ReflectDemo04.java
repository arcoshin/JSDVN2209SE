package reflect;

import java.lang.reflect.Method;
import java.util.Scanner;

/**
 * 通過反射動態地實例化對象
 */
public class ReflectDemo04 {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("請輸入類名:");
        String className = scanner.nextLine();
        Class cls = Class.forName(className);

        /**
         * 類對象提供了newInstance()，可以調用無參且公開的構造器進行實例化
         * 該類會返回Object的對象
         * InstantiationException 實例化異常 沒有無參構造不可以
         * IllegalAccessException 非法訪問異常 無參構造必須是公開的
         */
        Object o = cls.newInstance();
        System.out.println(o);
    }
}
