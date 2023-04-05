package thread.thread_3;

/**
 * ==========
 * 很不熟
 * ===========
 */
public class SyncDemo01_II {
    public static void main(String[] args) {
        Table table = new Table();
        Thread t1 = new Thread("A") {
            @Override
            public void run() {
                while (true) {
                    int bean = table.getBean();
                    System.out.println(getName() + "取了一顆豆子，剩下" + (bean - 1) + "顆");
                }
            }
        };
        t1.start();

        Thread t2 = new Thread("B") {
            @Override
            public void run() {
                while (true) {
                    int bean = table.getBean();
                    System.out.println(getName() + "取了一顆豆子，剩下" + (bean - 1) + "顆");
                }
            }
        };
        t2.start();


    }
}

class Table {
    private int beans = 1000;

    public synchronized int getBean() {
        if (beans <= 0) {
            throw new RuntimeException("豆子都被取完了");
        }
        return beans--;
    }
}