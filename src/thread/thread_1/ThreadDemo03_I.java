package thread.thread_1;


public class ThreadDemo03_I {
    public static void main(String[] args) {
        Thread t1 = new Thread(){
            @Override
            public void run() {
                System.out.println("A");
            }
        };t1.start();

        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("B");
            }
        };
        Thread t2 = new Thread(r1);
        t2.start();

        Runnable r3  = () -> {
            for (int i = 0; i < 1000; i++) {
                System.out.println("C");
            }
        };
        Thread t3 = new Thread(r3);
        t3.start();

    }
}
