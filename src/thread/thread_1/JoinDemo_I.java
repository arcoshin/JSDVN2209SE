package thread.thread_1;

public class JoinDemo_I {
    public static void main(String[] args) {
        Thread t1 = new Thread("download") {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    try {
                        System.out.println("download " + i + " %");
                        Thread.sleep(25);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("download finish!");
            }
        };



        Thread t2 = new Thread("show") {
            @Override
            public void run() {
                try {
                    System.out.println("showing photo......");
                    Thread.sleep(1000);
                    t1.join();
                    System.out.println("show photo finish!");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }


            }

        };
        t1.start();
        t2.start();



    }
}
