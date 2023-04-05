package thread.thread_1;

public class ThreadDemo02_I {
    public static void main(String[] args) {
        RunnableA r1 = new RunnableA();
        RunnableB r2 = new RunnableB();
        RunnableC r3 = new RunnableC();

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        Thread t3 = new Thread(r3);

        t1.start();
        t2.start();
        t3.start();


    }
}

class RunnableA implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.print("A");
        }
    }
}

class RunnableB implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.print("B");
        }
    }
}

class RunnableC implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.print("C");
        }
    }
}