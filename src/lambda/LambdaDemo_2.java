package lambda;

import java.io.File;
import java.io.FileFilter;

public class LambdaDemo_2 {
    public static void main(String[] args) {
        File file = new File("./demo2");

        FileFilter f1 = new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.getName().contains("collection_0");
            }
        };

        //沒用到的省略(接口名、方法名)
        FileFilter f2 = (File pathname) ->{
          return pathname.getName().contains("p");
        };

        //形參類型省略
        FileFilter f3 = (pathname) -> {
            return pathname.getName().contains("collection_0");
        };

        //單一形參括號省略
        FileFilter f4 = pathname -> {
            return pathname.getName().contains("collection_0");
        };

        //單一語句大括號省略
        FileFilter f5 = pathname -> pathname.getName().contains("collection_0");

        File[] list = file.listFiles(f5);
        for (File f : list) {
            System.out.println(f.getName());
        }


    }
}
