package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/**
 * 將集合轉換為數組
 * Collection中定義一個方法toArray，
 * 該方法可將集合轉換為數組
 */
public class CollectionToArrayDemo {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<>();
        c.add("A");//複製當前行到下一行 Ctrl + D
        c.add("B");//鼠標快速跳到下一行 Shift + Enter
        c.add("C");
        c.add("D");
        c.add("E");
        System.out.println("集合:" + c);

        /**
         * toArray();無參方法基本不使用，因為返回數組為Object類型與泛型衝突
         * 隨著JDK5推出泛型，產生了重載方法toArray(T[] a),
         * 這個方法可以根據指定的參數數組類型生成對應的類型數組
         * toArray中傳入的數組類型需要和轉換的集合泛型一致
         * 數組的長度一般都要和集合中儲存的元素個數相同
         */
//        Object[] array = c.toArray();//基本不使用
        String[] array = c.toArray(new String[c.size()]);//過多會返回null
        System.out.println("數組:" + Arrays.toString(array));//調用Arrays.toString"翻譯輸出內容，否則返回內存地址
    }
}
