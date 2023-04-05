package thread;

/**
 * 守護線程
 * java將線程分為兩類:用戶線程與守護線程 也稱為前台線程與後台線程
 * 守護線程是通過普通的用戶線程調用setDaemon(true)設置轉變而來
 * 因此創建和使用上和普通的線程沒有區別
 * 主要區別在於:
 * 當用戶線程結束，意味著線程結束
 * 此時，所有的守護線程會被立即殺死
 */
public class DaemonDemo {
    public static void main(String[] args) {
        Thread t1 = new Thread("rose") {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println(getName() + ": let me go");

                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(getName() + ": r~~~~~~~~~~~~~~");
                System.out.println("撲通~全劇終");
            }

        };

        Thread t2 = new Thread("jack") {
            @Override
            public void run() {
                while (true){
                    System.out.println("U jump! practice jump!");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }

        };
        t1.start();
        t2.setDaemon(true);//設置為守護線程
        /**
         * 當所有用戶程序線程結束時，就意味著進程結束
         * 而此時守護線程也會被殺死
         * t1為用戶線程
         * t2為守護線程
         * main為主線程，執行完t2.start即死亡了
         */
        t2.start();
    }
}
