package thread;

/**
 * 使用synchronized關鍵鎖定多個代碼片段，
 * 並且指定鎖對象(同步監視器)相同時，這些代碼就是互斥的
 * 多個線程不能同時訪問他們
 */
public class SyncDemo03 {
    public static void main(String[] args) {
        Throat throat = new Throat();

        Thread t1 = new Thread("口腔"){
            @Override
            public void run() {
                throat.eat();
            }
        };

        Thread t2 = new Thread("鼻腔"){
            @Override
            public void run() {
                throat.breath();
            }
        };
        t1.start();
        t2.start();


    }
}


class Throat {
    public synchronized void eat() {
        Thread t = Thread.currentThread();
        System.out.println(t.getName() + "開始吞嚥");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(t.getName() + "吞嚥完畢");
    }

    public synchronized void breath() {
        Thread t = Thread.currentThread();
        System.out.println(t.getName() + "吸氣");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(t.getName() + "呼氣");
    }
}