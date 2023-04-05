package thread.thread_1;

public class SleepDemo01_I {
    public static void main(String[] args) {
        System.out.println("程序開始了");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("程序結束了");



    }
}
