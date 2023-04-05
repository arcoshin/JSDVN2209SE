package thread.thread_1;

import java.util.Scanner;

public class SleepDemo02_I {
    public static void main(String[] args) {
        System.out.println("請輸入數字");
        Scanner scanner = new Scanner(System.in);
        int time = scanner.nextInt();
        System.out.println("倒數開始了");
        try {
            for (int i = time; i > 0; i--) {
                System.out.println(i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("倒數結束了");
        


    }
}
