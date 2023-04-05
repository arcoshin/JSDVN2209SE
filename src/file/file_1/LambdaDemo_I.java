package file.file_1;

import java.io.File;
import java.io.FileFilter;

public class LambdaDemo_I {
    public static void main(String[] args) {
        FileFilter f1 = new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                String name = pathname.getName();
                return name.contains("collection_0");
            }
        };

        /**
         * 省略接口名及方法名
         */
        FileFilter f2 = (File pathname) -> {
            return pathname.getName().contains("collection_0");
        };

        /**
         * 省略型參類型
         */
        FileFilter f3 = (pathname) -> {
            return pathname.getName().contains("collection_0");
        };

        /**
         * 單一形參可省略括號
         */
        FileFilter f4 = pathname -> {
            return pathname.getName().contains("collection_0");
        };

        /**
         * 代碼塊中只有一句代碼可省略花括號
         */
        FileFilter f5 = pathname ->
            pathname.getName().contains("collection_0");

        File file = new File("./demo");
        File[] list = file.listFiles(f5);
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }


    }
}

