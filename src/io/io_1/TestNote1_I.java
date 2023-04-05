package io.io_1;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class TestNote1_I {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("請輸入要寫入的文件");
        String path = scanner.nextLine();
        File file = new File("./demo");

        file = new File(file, path);
        FileOutputStream fos = new FileOutputStream(file);
        System.out.println("請輸入要寫入的內容");
        while (true) {
            String line = scanner.nextLine();
            if ("exit".equals(line)) {
                break;
            }
            fos.write(line.getBytes(StandardCharsets.UTF_8));
        }
        fos.close();
    }
}
