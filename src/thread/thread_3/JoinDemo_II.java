package thread.thread_3;

/**
 * ===========================================================
 * join()者，路霸也，從哪卡位就從哪做到完才往後走
 * ===========================================================
 */
public class JoinDemo_II {
    public static void main(String[] args) {
        Thread t3 = new Thread() {
            @Override
            public void run() {
                try {
                    System.out.println("downloading bg");
                    Thread.sleep(8000);
                    System.out.println("bg OK!");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };


        Thread t4 = new Thread() {
            @Override
            public void run() {
                try {
                    System.out.println("taking word");
                    Thread.sleep(4000);
                    t3.join();
                    System.out.println("word OK!");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };


        Thread t1 = new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    try {
                        System.out.println("download " + i * 10 + " %");
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                try {
                    t4.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("download ok");

            }
        };


        Thread t2 = new Thread() {
            @Override
            public void run() {
                try {
                    System.out.println("showing photo......");
                    Thread.sleep(5000);
                    t1.join();
                    System.out.println("show ok");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };


        t1.start();
        t2.start();
        t3.start();
        t4.start();


    }
}
