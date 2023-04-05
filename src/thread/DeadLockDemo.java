package thread;

/**
 * 死鎖(面試題)
 * 當多個線程都各自持有一個鎖時
 * 互相等待對方先釋放鎖時，就會形成一種僵持的狀態
 * 這個狀態稱為死鎖
 * <p>
 * 其中一種解法
 * 用完鎖時，及時釋放
 */
public class DeadLockDemo {
    static Object chopsticks = new Object();
    static Object spoon = new Object();

    public static void main(String[] args) {
        Thread t1 = new Thread("北方人") {
            @Override
            public void run() {
                try {
                    System.out.println(getName() + "開始用餐");
                    //拿起筷子
                    synchronized (chopsticks) {
                        System.out.println(getName() + "拿起筷子開始吃飯");
                        Thread.sleep(5000);
                        System.out.println(getName() + "吃完飯了");
                    }
                    System.out.println(getName() + "放下了筷子去拿湯匙");
                    synchronized (spoon) {
                        System.out.println(getName() + "拿起湯匙開始喝湯");
                        Thread.sleep(5000);
                        System.out.println(getName() + "喝完湯了");
                    }
                    System.out.println(getName() + "放下了湯匙");
                    System.out.println(getName() + "用餐完畢");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        };

        Thread t2 = new Thread("南方人") {
            @Override
            public void run() {
                try {
                    System.out.println(getName() + "開始用餐");
                    //拿起筷子
                    synchronized (spoon) {
                        System.out.println(getName() + "拿起湯匙開始喝湯");
                        Thread.sleep(5000);
                        System.out.println(getName() + "喝完湯了");
                    }
                    System.out.println(getName() + "放下了湯匙");
                    synchronized (chopsticks) {
                        System.out.println(getName() + "拿起筷子開始吃飯");
                        Thread.sleep(5000);
                        System.out.println(getName() + "吃完飯了");
                    }
                    System.out.println(getName() + "放下了筷子");

                    System.out.println(getName() + "用餐完畢");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        };
        t1.start();
        t2.start();


    }
}
