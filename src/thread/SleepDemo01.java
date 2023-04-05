package thread;

/**
 * 線程中提供一個靜態方法
 * static void sleep(long ms)
 * 當一個線程調用sleep();時，進入阻塞狀態維持指定的毫秒數
 * 直到超過時間後，會自動回到Runnable狀態再次等待CPU調用
 */
public class SleepDemo01 {
    public static void main(String[] args) {
        System.out.println("程序運行開始");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("程序運行結束");
    }
}
