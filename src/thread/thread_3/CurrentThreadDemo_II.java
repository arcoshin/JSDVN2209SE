package thread.thread_3;

public class CurrentThreadDemo_II {
    public static void main(String[] args) {
        Thread t1 = new Thread("001"){
            @Override
            public void run() {
                System.out.println("運行!");
                System.out.println(currentThread());
            }
        };
        t1.start();
    }
}
