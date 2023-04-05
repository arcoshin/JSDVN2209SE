package reflect;

import reflect.annotations.AutoRunClass;

import java.io.File;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * 在反射機制中使用註解
 */
public class ReflectDemo09 {
    public static void main(String[] args) throws Exception {
        //1.定位ReflectDemo09所在的包路徑
        File dir = new File(
                ReflectDemo09.class.getResource(".").toURI()
        );
        System.out.println(dir);

        //2.獲取dir中所有的.class文件
        File[] subs = dir.listFiles(f -> f.getName().endsWith(".class"));

        //3.遍歷subs
        for (File sub : subs) {

            //4.獲取文件名(含有.class)
            String filename = sub.getName();

            //5.獲取純類名
            String classname = filename.substring(0 , filename.indexOf("."));

            //6.拼接包路徑與類名，獲取全路徑(注意拼接十中間有一個".")
            String path = Test03.class.getPackage().getName() + "." + classname;

            //7.獲取Person類的Class實例
            Class cls = Class.forName(path);

            /**
             * 定位到哪個類被@AutoRunClass註解修飾了
             *
             * isAnnotationPresent(Class annotation)
             * 判斷當前對象是否被給定的註解修飾了
             */
            if(cls.isAnnotationPresent(AutoRunClass.class)){
                System.out.println(classname + ":被@AutoRunClass修飾了");
            } else {
                System.out.println(classname + ":沒有被@AutoRunClass修飾");
            }

        }
    }
}
