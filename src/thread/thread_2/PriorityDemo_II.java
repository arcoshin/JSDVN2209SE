package thread.thread_2;

public class PriorityDemo_II {
    public static void main(String[] args) {
        Thread t1 = new Thread("MAX") {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println(getName() + ">>>" + i);
                }
            }
        };

        Thread t2 = new Thread("MIN") {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println(getName() + ">>>" + i);
                }
            }
        };

        Thread t3 = new Thread("NOR") {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println(getName() + ">>>" + i);
                }
            }
        };

        t1.setPriority(10);
        t2.setPriority(1);
        t1.start();
        t2.start();
        t3.start();


    }
}
