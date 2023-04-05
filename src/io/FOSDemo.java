package io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/**
 * FOS FileOutputStream 文件輸入流
 * 利用該流，可以通過程序從文件中輸出字節
 */
public class FOSDemo {
    public static void main(String[] args) throws IOException {
//        //向當前項目的demo目錄中fos.txt文件輸出內容
//        File file = new File("./demo/fos.txt");
//        //將文件上綁定一個文件字節輸出流
//        FileOutputStream out = new FileOutputStream(file);
        //簡潔打法
        FileOutputStream out = new FileOutputStream("./demo/fos.txt");

        //1.利用out流，向文件寫入數據
        out.write(97);//a
        out.write(98);//b
        out.write(99);//c
        out.write(100);//d
        out.write(101);//e
        //特殊必背兩組
        out.write(13);//Enter
        out.write(10);//換行，不同於Enter
        System.out.println("寫出完畢");

        /**2.向文件一次寫一個byte數組
         * getBytes();可以將字符串轉成字節數組
         * \r\n表示輸入換行
         */
        out.write("JSDVN2209yyds".getBytes(StandardCharsets.UTF_8));
        out.write("\r\n".getBytes());
        out.write("JSDVN2209yyds\r\n".getBytes());

        /**
         * 向文件寫出byte數組，但是只寫出這個數組的一部分
         * write(byte[] ,此參數表示起始的下標,此參數表示輸出的下標個數長度)
         */
        out.write("2209COMEON!!!!!\r\n".getBytes(),4,6);
        System.out.println("程序輸出成功");//COMEON

        //使用完流之後一定要關閉，否則持續佔用資源
        out.close();
    }
}
