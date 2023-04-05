package thread.thread_1;

public class ThreadDemo01_I {
    public static void main(String[] args) {
        ThreadA t1 = new ThreadA();
        ThreadB t2 = new ThreadB();
        ThreadC t3 = new ThreadC();
        t1.start();
        t2.start();
        t3.start();

    }
}

class ThreadA extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.print("A");
        }
    }
}

class ThreadB extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.print("B");
        }
    }
}

class ThreadC extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.print("C");
        }
    }
}
