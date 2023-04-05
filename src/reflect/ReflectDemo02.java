package reflect;

import java.lang.reflect.Method;

/**
 * 類名.class獲取類是不理想的，不太靈活，所以換成較為靈活的方次
 */
public class ReflectDemo02 {
    public static void main(String[] args) {
        Class cls = Person.class;
        /**
         * 獲取當前類對象所表示的類自身定義的所有方法(包含私有但不包含父類繼承的方法)
         */
        Method[] methods = cls.getDeclaredMethods();
        System.out.println(cls.getSimpleName() + ":一共有" + methods.length + "個方法");
        for (Method method : methods) {
            System.out.println(method.getName());
        }

    }
}
