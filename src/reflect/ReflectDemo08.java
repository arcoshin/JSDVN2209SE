package reflect;

import java.lang.reflect.Method;

/**
 * 暴力反射，反射非常強大，他甚至可以直接操作程序的私有屬性
 * 以往學習中，經由private修飾的資源，只能從類內部訪問，外界無法訪問的規則
 * 經由反射的暴力反射，這個規則就可以打破
 */
public class ReflectDemo08 {
    public static void main(String[] args) throws Exception {
        Person p = new Person();
        //p.secret;

        Class cls = Class.forName("reflect.Person");
        Object o = cls.newInstance();

        /**
         * 獲取調用的方法
         * getMethod 獲取公開方法(包含父類繼承的方法)
         * getDeclaredMethod 獲取本類中定義的方法(包括私有的方法)
         */

        Method method = cls.getDeclaredMethod("secret");
        /**
         * 強行打開訪問權限
         */
        method.setAccessible(true);
        method.invoke(o);
        method.setAccessible(false);//用完記得關閉權限



    }
}
