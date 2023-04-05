package thread.thread_3;

public class SyncDemo02_II {
    public static void main(String[] args) {
        GoShopping GS = new GoShopping();
        Thread t1 = new Thread("A") {
            @Override
            public void run() {
                GS.Buy();
            }
        };
        t1.start();
        Thread t2 = new Thread("B") {
            @Override
            public void run() {
                GS.Buy();
            }
        };
        t2.start();

    }

}


class GoShopping {
    public void Buy() {
        try {
            Thread t = Thread.currentThread();
            System.out.println(t.getName() + "正在挑衣服...");
            Thread.sleep(5000);
            synchronized (GoShopping.this) {
                System.out.println(t.getName() + "正在試衣服");
                Thread.sleep(5000);
            }
            System.out.println(t.getName() + "結帳離開了!");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}