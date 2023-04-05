package thread;

/**
 * 第二種創建線程的方式
 * 實現Runnable接口單獨定義任務
 * 可以不占用父類位置並且有更高的擴展性
 */
public class ThreadDemo02 {
    public static void main(String[] args) {
        MyRunnable1 r1 = new MyRunnable1();
        MyRunnable2 r2 = new MyRunnable2();
        MyRunnable3 r3 = new MyRunnable3();
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        Thread t3 = new Thread(r3);
        t1.start();
        t2.start();
        t3.start();


    }
}


class MyRunnable1 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.print("A");
        }

    }
}

class MyRunnable2 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.print("B");
        }

    }
}

class MyRunnable3 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.print("C");
        }

    }
}