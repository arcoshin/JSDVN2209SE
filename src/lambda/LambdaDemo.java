package lambda;

import java.io.File;
import java.io.FileFilter;

public class LambdaDemo {
    public static void main(String[] args) {
        FileFilter f1 = new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                String name = pathname.getName();//pathname表示當前每個被過濾的對象
                System.out.println("正在過濾:" + name);
                return name.contains("collection_0");
            }
        };

        /**
         * 1.使用lambda表達式 --- 忽略接口名和方法名
         * 可以省略"new FileFilter()"，因為可以使用等號右邊的類型表示聲明的類型
         * 方法名"public boolean accept"也要忽略，因為lambda只適用只有一個方法的接口，故可省略
         * 將重寫方法的形參提到等號右邊，並用->鏈接花括號
         */
        FileFilter f2 = (File pathname) -> {
                return pathname.getName().contains("collection_0");
        };
        /**
         * 2.使用lambda表達式 --- 忽略參數類型
         * 可以省略參數類型"File"，因為方法的類型和參數的順序已經定好了
         */
        FileFilter f3 = (pathname) -> {
            return pathname.getName().contains("collection_0");
        };
        /**
         * 3.使用lambda表達式 --- 如果方法只有一個參數，參數的()也可以省略
         */
        FileFilter f4 = pathname -> {
            return pathname.getName().contains("collection_0");
        };
        /**
         * 4.如果當前方法體中只有一句代碼，則方法體的花括號也可省略
         * 但如果有return，也要一併忽略
         */
        FileFilter f5 = pathname -> pathname.getName().contains("collection_0");

        File file = new File("./demo");
        File[] files = file.listFiles(f ->f.getName().contains("collection_0"));
        for (int i = 0; i < files.length; i++) {
            System.out.println(files[i].getName());
        }
    }
}
