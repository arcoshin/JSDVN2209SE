package reflect;

import java.lang.reflect.Method;

/**
 * JAVA反射機制
 * 反射是JAVA中的動態機制，他允許我們在程序運行時間時
 * 再確定對象的實例化、方法的調用、屬性的操作等
 * 這使得程序靈活度大幅提升，但是資源開銷大而運行效率低
 * 反射只用在重要的地方，不能過度依賴處處使用
 * 寫程序時，更建議要計劃和反射結合使用
 */
public class ReflectDemo01 {
    public static void main(String[] args) {
        /**
         * Class類 是java.Lang.Class的類，
         * 此類較為特殊，我們是不會自行new這個類的
         * Class的每一個實例用以表示JVM中加載的一個類
         * 並且每個被JVM加載的類都有且僅有一個Class類的實例
         * 通過該實例，可以獲取其表示的類的一切訊息，
         * 包含了類名、包名、構造器、方法屬性等等
         * 如此便可於運行期間獲取該內容，甚至操作該內容
         * 因此反射的第一步就是要獲取要操作類的Class實例
         *  1).類名.class
         *   Class cls = Person.class
         *   Class cls = int.class
         *   注意:基本類型只能通過這種方式獲取Class實例
         *   但是這種方式有一個缺點，就是寫死了類型代碼，會經常使用方法參數的聲明
         *
         *  2).Class.forName(String className)
         *   Class cls = Class.forName("com.tedu.pojo.Person")
         *   這種方式比較推薦使用，較為靈活
         */

        //獲取Person的類對象
        Class cls = Person.class;
        /**
         * String的類對象，包含了String的所有訊息
         * 所以我們可以通過該對象，獲取String的類名、包名、類中方法等
         */
        //獲取字節碼文件的名稱
        String name = cls.getName();
        System.out.println("全類名:" + name);

        //直接獲取類名
        name = cls.getSimpleName();//Simple 簡單的
        System.out.println("純類名:" + name);

        //獲取當前類中的所有公開方法(包含超類繼承的方法)
        Method[] methods = cls.getMethods();
        System.out.println(name + ":一共有" + methods.length + "個公開方法");
        for (Method method : methods) {
            System.out.println(method.getName());
        }



    }
}
