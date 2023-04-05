package thread;


/**
 * sleep()方法要求必須處理中斷異常
 * 當一個線程調用sleep()方法處於阻塞狀態時
 * 此時該線程的interrupt()方法被調用時
 * 會立即中斷該線程的睡眠阻塞，並拋出中斷異常
 */
public class SleepDemo04 {
    public static void main(String[] args) {
        Thread t1 = new Thread("睡美人") {
            @Override
            public void run() {
                System.out.println(getName() + "好累阿，睡一覺好了~~~");
                try {
                    Thread.sleep(10000);
                    System.out.println(getName() + "睡的真舒服呢~~~");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    System.out.println(getName() + "唉呀，睡眠被中斷了呢!!");
                }
            }
        };
        Thread t2 = new Thread("鬧鐘") {
            @Override
            public void run() {
                System.out.println(getName() + "起床~起床~代人叫起床~");
                for (int i = 0; i < 5; i++) {
                    System.out.println("小姐起床~");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("真的起床了!?");
                System.out.println(getName() + "大哥!搞定!唉呀~叫錯人了阿~");
                t1.interrupt();//中斷t1的睡眠(阻塞)
            }
        };

        t1.start();
        t2.start();
    }
}
