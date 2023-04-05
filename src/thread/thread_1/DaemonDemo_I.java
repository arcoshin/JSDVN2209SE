package thread.thread_1;

public class DaemonDemo_I {
    public static void main(String[] args) {
        Thread t1 = new Thread("Rose") {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println(getName() + "let me go !");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("RRR~~~~~~~~~~~~");
                System.out.println("The End");
            }
        };
        t1.start();

        Thread t2 = new Thread("Jack") {
            @Override
            public void run() {
                while (true) {
                    System.out.println(" U J practice J");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        t2.setDaemon(true);
        t2.start();//順序不可錯位
    }
}
