package lambda;

import java.io.File;
import java.io.FileFilter;

public class LambdaDemo_1 {
    public static void main(String[] args) {
        File file = new File("./demo");
        FileFilter f1 = new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.getName().contains("collection_0");
            }
        };

        //沒用到的接口名以及方法名省略
        FileFilter f2 = (File pathname) -> {
                return pathname.getName().contains("collection_0");
            };

        //形參類型可省略
        FileFilter f3 = (pathname) -> {
            return pathname.getName().contains("collection_0");
        };

        //單一形參省略括號
        FileFilter f4 = pathname -> {
            return pathname.getName().contains("collection_0");
        };

        //單一命令可省大括號
        FileFilter f5 = pathname -> pathname.getName().contains("collection_0");
        File[] list = file.listFiles(f5);
        for (File f : list) {
            System.out.println(f.getName());
        }


    }
}
