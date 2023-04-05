package thread.thread_3;

public class ThreadDemoAll_II {
    public static void main(String[] args) {
        /**
         * Type practice
         */
        Thread t1 = new Thread(){
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    System.out.print("A");
                }
            }
        };t1.start();

        /**
         * Type practice_2
         */
        ThreadMission threadMission = new ThreadMission();
        Thread t2 = new Thread(threadMission);
        t2.start();

        /**
         * Type practice_3
         */
        Runnable r3 = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    System.out.print("C");
                }
            }
        };
        Thread t3 = new Thread(r3);
        t3.start();

        /**
         * Type practice_3 - Lambda
         */
        Runnable r4 = () -> {
            for (int i = 0; i < 1000; i++) {
                System.out.print("D");
            }
        };


    }
}

/**
 * Type practice_2
 */
class ThreadMission implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.print("B");
        }
    }
}
