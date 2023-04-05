package thread.thread_3;

/**=============================================================
 * 守護者乃天生也，眾人死絕人亦絕。
 * setDaemon者，必在自身start前，其餘未設定者全完結即跟隨完結，守護者線程也
 ==============================================================*/
public class DaemonDemo_II {
    public static void main(String[] args) {
        Thread t1 = new Thread("zs") {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    try {
                        System.out.println(getName() + ">>>" + i);
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(getName() + " stops");
            }
        };
        t1.start();

        Thread t2 = new Thread("ls") {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    try {
                        System.out.println(getName() + ">>>" + i);
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        t2.setDaemon(true);
        t2.start();

        Thread t3 = new Thread("ww"){
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    try {
                        System.out.println(getName() + ">>>" + i);
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }

        };
        t3.setDaemon(true);
        t3.start();


    }
}
