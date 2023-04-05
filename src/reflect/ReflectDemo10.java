package reflect;

import reflect.annotations.AutoRunClass;
import reflect.annotations.AutoRunMethod;

import java.io.File;
import java.lang.reflect.Method;

/**
 * 在反射機制中使用註解
 */
public class ReflectDemo10 {
    public static void main(String[] args) throws Exception {
        //1.定位ReflectDemo09所在的包路徑
        File dir = new File(
                ReflectDemo10.class.getResource(".").toURI()
        );
        System.out.println(dir);

        //2.獲取dir中所有的.class文件
        File[] subs = dir.listFiles(f -> f.getName().endsWith(".class"));

        //3.遍歷subs
        for (File sub : subs) {

            //4.獲取文件名(含有.class)
            String fileName = sub.getName();

            //5.獲取純類名
            String className = fileName.substring(0, fileName.indexOf("."));

            //6.拼接包路徑與類名，獲取全路徑(注意拼接十中間有一個".")
            String path = Test03.class.getPackage().getName() + "." + className;

            //7.獲取Person類的Class實例
            Class cls = Class.forName(path);

            /**
             * 定位到哪個類被@AutoRunClass註解修飾了
             *
             * isAnnotationPresent(Class annotation)
             * 判斷當前對象是否被給定的註解修飾了
             */
            if (cls.isAnnotationPresent(AutoRunClass.class)) {
                System.out.println("實例化:" + className);
                //將當前被@AutoRunClass註解修飾的類進行實例化
                Object o = cls.newInstance();
                System.out.println(o);

                //獲取當前類中所有自身定義方法
                Method[] methods = cls.getDeclaredMethods();
                for (Method method : methods) {
                    //獲取被@AutoRunMethod註解修飾的方法
                    if (method.isAnnotationPresent(AutoRunMethod.class)) {
                        System.out.println("自動調用方法:" + method.getName());
                        //調用這些被標記的方法
                        method.invoke(o);
                    }
                }


            }
        }
    }
}
