package thread;

/**
 * 同步代碼塊
 * 有效縮小同步範圍，在確保安全的前提下，盡可能提高效率
 * synchronized(同步監視對象){
 * 需要多線程同步執行的代碼片段
 * }
 */
public class SyncDemo02 {
    public static void main(String[] args) {
        Shop shop = new Shop();
        Thread t1 = new Thread("zs") {
            @Override
            public void run() {
                shop.buy();
            }
        };
        Thread t2 = new Thread("ls") {
            @Override
            public void run() {
                shop.buy();
            }
        };
        t1.start();
        t2.start();


    }
}

class Shop {
    public void buy() {//synchronized直接修飾將使整個效率減半
        try {
            //獲取運行buy方法的線程對象
            Thread t = Thread.currentThread();
            System.out.println(t.getName() + "正在挑衣服");
            Thread.sleep(5000);
            synchronized (this) {//指的是調用者Shop;
                //只有試衣服需要同步先後，其餘可以多線程併發
                System.out.println(t.getName() + "正在試衣服");
                Thread.sleep(5000);
            }
            System.out.println(t.getName() + "結帳離開");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}