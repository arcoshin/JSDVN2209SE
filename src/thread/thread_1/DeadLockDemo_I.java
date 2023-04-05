package thread.thread_1;

public class DeadLockDemo_I {
    static Object Chopsticks = new Object();
    static Object Spoon = new Object();


    public static void main(String[] args) {
        Thread t1 = new Thread("zs"){
            @Override
            public void run() {
                try {
                    synchronized (Chopsticks) {
                        System.out.println(getName() + "想先吃飯");
                        Thread.sleep(5000);
                        System.out.println(getName() + "拿起筷子夾菜吃飯");
                        Thread.sleep(5000);
                        System.out.println(getName() + "吃飯完畢放下筷子");
                        Thread.sleep(5000);
                    }
                    synchronized (Spoon) {
                        System.out.println(getName() + "接著想喝湯拿起湯匙");
                        System.out.println(getName() + "張口喝湯");
                        Thread.sleep(5000);
                        System.out.println(getName() + "喝湯完畢放下湯匙");
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        t1.start();

        Thread t2 = new Thread("ls"){
            @Override
            public void run() {
                try {
                    synchronized (Spoon) {
                        System.out.println(getName() + "想先喝湯");
                        Thread.sleep(5000);
                        System.out.println(getName() + "拿起湯匙張口喝湯");
                        Thread.sleep(5000);
                        System.out.println(getName() + "喝湯完畢放下湯匙");
                        Thread.sleep(5000);
                    }
                    synchronized (Chopsticks) {
                        System.out.println(getName() + "接著想吃飯拿起筷子");
                        System.out.println(getName() + "夾菜吃飯");
                        Thread.sleep(5000);
                        System.out.println(getName() + "吃飯完畢放下筷子");
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        t2.start();


    }
}
