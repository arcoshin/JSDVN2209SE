package thread;

/**
 * 多線程
 * 多線程可以併並聯執行多的任務
 * 多線程的第一種創建方式
 * 繼承Thread並重寫run方法
 */
public class ThreadDemo01 {
    public static void main(String[] args) {
        MyThread01 t1 = new MyThread01();
        MyThread02 t2 = new MyThread02();
        MyThread03 t3 = new MyThread03();
        //啟動多線程要調用start();而非調用run();因其為內部方法
        t1.start();
        t2.start();
        t3.start();
    }
}
//定義一個類繼承Thread類，那麼該類就是多線程類
class MyThread01 extends Thread{
    @Override
    public void run(){
        for (int i = 0; i < 1000; i++) {
            System.out.print("A");
        }
    }
}

class MyThread02 extends Thread{
    @Override
    public void run(){
        for (int i = 0; i < 1000; i++) {
            System.out.print("B");
        }
    }
}

class MyThread03 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.print("C");
        }
    }
}