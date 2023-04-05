package thread.thread_3;

//鬧鐘叫人
public class SleepDemoAll_II {
    public static void main(String[] args) {
        //人
        Thread t1 = new Thread() {
            @Override
            public void run() {
                    try {
                        System.out.println("Sleeping.....");
                        Thread.sleep(10000);
                    } catch (InterruptedException e) {
                        System.out.println("人醒了");
                    }

            }
        };
        t1.start();


        //鬧鐘
        Thread t2 = new Thread() {
            @Override
            public void run() {

                for (int i = 5; i > 0; i--) {
                    try {
                        System.out.println("鬧鐘" + ">>>" + i);
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                t1.interrupt();

            }

        };
        t2.start();


    }
}
