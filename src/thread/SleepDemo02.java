package thread;

import java.util.Scanner;

/**
 * 倒數程序
 * 啟動程序後，再輸入一個數字，從該數字開始倒數計時
 * 每秒輸出一個倒數數字，級到輸出0為止，輸出時間到!
 */
public class SleepDemo02 {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("請輸入一個數字");
            int time = scanner.nextInt();
            for (int i = time; i >0 ; i--) {//For循環新用法，要多看
                System.out.println(i);
                Thread.sleep(1000);
            }
            System.out.println("時間到!!");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
