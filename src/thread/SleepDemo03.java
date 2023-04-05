package thread;


/**
 * sleep()方法要求必須處理中斷異常
 * 當一個線程調用sleep()方法處於阻塞狀態時
 * 此時該線程的interrupt()方法被調用時
 * 會立即中斷該線程的睡眠阻塞，並拋出中斷異常
 */
public class SleepDemo03 {
    public static void main(String[] args) {
        Thread t1 = new Thread("睡美人") {
            @Override
            public void run() {
                System.out.println(getName() + ">>>好累阿，睡一覺好了~~~");
                try {
                    Thread.sleep(5000);
                    System.out.println(getName() + ">>>睡的真舒服呢~~~");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    System.out.println(getName() + ">>>唉呀，被被醒了呢!!");
                }
            }
        };
        t1.start();
    }
}
