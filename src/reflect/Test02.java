package reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * 通過反射自動調用當前Person類中，名稱含有"s"的無參公開方法
 */
public class Test02 {
    public static void main(String[] args) throws Exception {
        //1.獲取Person類的Class實例
        Class cls = Class.forName("reflect.Person");

        //2.創建Person的實例對象
        Object o = cls.newInstance();

        //3.獲取Person類中的所有的本類方法
        cls.getMethods();//本類所有公開方法，會取到父類
        Method[] methods = cls.getDeclaredMethods();//本類所有方法

        //4.遍歷methods中的每一個方法，進行篩選
        for (Method method : methods) {

            if (method.getName().contains("s") &&
                    method.getParameterCount() == 0 && //getParameterCount()，獲取方法中的參數個數，如果為0，說明無參
                    method.getModifiers() == Modifier.PUBLIC //getModifiers()，獲取方法的訪問權限
            ) {
                //5.執行目標方法
                System.out.println("自動執行方法:" + method.getName());
                method.invoke(o);
            }
        }
    }
}
