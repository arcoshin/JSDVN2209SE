package reflect;

import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * 通過反射自動調用當前包中，所有類中所有名稱含有"s"的無參公開方法
 */
public class Test03 {
    public static void main(String[] args) throws Exception {
        //1.定位Test03所在的包
        File dir = new File(
                Test03.class.getResource(".").toURI()
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
            //String classname = filename.substring(0 , filename.length() - 6);//也可以
            //System.out.println(classname);//打樁語句

            //6.拼接包路徑與類名，獲取全路徑(注意拼接十中間有一個".")
            String path = Test03.class.getPackage().getName() + "." + classname;

            //7.獲取Person類的Class實例
            Class cls = Class.forName(path);

            //8.創建Person的實例對象
            Object o = cls.newInstance();

            //9.獲取Person類中的所有的本類方法
            //cls.getMethods();//本類所有公開方法，會取到父類
            Method[] methods = cls.getDeclaredMethods();//本類中定義的所有方法

            //10.遍歷methods中的每一個方法，進行篩選
            for (Method method : methods) {

                if (method.getName().contains("s") &&
                        method.getParameterCount() == 0 && //getParameterCount()，獲取方法中的參數個數，如果為0，說明無參
                        method.getModifiers() == Modifier.PUBLIC //getModifiers()，獲取方法的訪問權限
                ) {
                    //11.執行目標方法
                    System.out.println("自動執行方法:" + method.getName());
                    method.invoke(o);
                }
            }
        }


    }
}
