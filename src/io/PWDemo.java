package io;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

/**
 * PW PrintWriter 具有自動行刷新功能的緩衝字符輸出流
 * 內部基礎連接BufferedWriter
 * 特點 :
 * 1.可以輸出字符串
 * 2.可以自動行刷新
 * 可以提高寫出字符的效率
 *
 */
public class PWDemo {
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        PrintWriter pw = new PrintWriter("./demo/pw.txt","UTF-8");
        /**特殊高級流連接地址
         * 內部封裝 BufferedWriter，OutputStreamWriter(new FileOutputStream(file path)
         *
         */
        pw.println("活魚逆流而上!");//println();將字符串按行寫入
        pw.println("鹹魚隨波逐流~~");
        pw.close();

    }
}
