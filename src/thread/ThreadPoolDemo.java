package thread;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 線程池
 * 池化技術:事先準備好一些資源，有需要時方便調用，用畢即歸還，使資源得到複用
 * 線程池的好處:
 * 1.降低資源的消耗
 * 2.提高相應的速度
 * 3.方便管理
 */
public class ThreadPoolDemo {
    public static void main(String[] args) {
        //創建一個固定大小的線程池，容量為3。但注意內部尚無任何線程對象。
        ExecutorService pool = Executors.newFixedThreadPool(3);//Executors:線程工具類
        for (int i = 0; i < 10; i++) {
            Runnable r = new Runnable() {
                @Override
                public void run() {
                    Thread t = Thread.currentThread();
                    System.out.println(t.getName() + "正在執行任務...");
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(t.getName() + "任務執行完畢!!!");
                }
            };
            //將任務交給線程池，線程池會接收該任務，並且創建線程執行該任務
            pool.execute(r);
            System.out.println("將任務交給線程池!!!");
        }
        /**
         * 線程池中的任務執行完畢後，線程對象並不會被銷毀，而是等待新的任務以繼續執行
         * 這個特點是複合式服務器的特點，因為服務器本身就是長時間啟動的
         * 如果有需要任務執行完畢後，就關閉線程池的需求，那麼可以調用shutdown();
         * 該方法可以等待著所有任務執行完畢後，將線程池關閉
         * shutdownNow();只要執行該方法，無論任務是否執行完畢，都會立即關閉線程池(極少用)
         *
         * --->記得在循環之外關閉線程對象，否則循環內一指派任務就關閉線程池，會馬上報錯
         * */
        pool.shutdown();
        System.out.println("線程池被關閉了!!!");

    }
}
