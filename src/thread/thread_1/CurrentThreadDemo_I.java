package thread.thread_1;

public class CurrentThreadDemo_I {
    public static void main(String[] args) {
        Thread t1 = new Thread("線程一號"){
            @Override
            public void run() {
                System.out.println("程序開始運行了");
                System.out.println(Thread.currentThread());
            }
        };
        t1.start();
    }
}
