package thread.thread_1;

public class SyncDemo02_I {
    public static void main(String[] args) {
        Shop shop = new Shop();
        Thread t1 = new Thread("小紅") {
            @Override
            public void run() {
                shop.buy();
            }
        };
        t1.start();

        Thread t2 = new Thread("小藍") {
            @Override
            public void run() {
                shop.buy();
            }
        };
        t2.start();
    }
}

class Shop{
    public void buy(){
        try {
            Thread t = Thread.currentThread();
            System.out.println(t.getName() + "正在試衣服...");
            Thread.sleep(5000);

            synchronized (this) {
                System.out.println(t.getName() + "正在試衣服");
                Thread.sleep(5000);
            }

            System.out.println(t.getName() + "結帳離開");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }





    }
}