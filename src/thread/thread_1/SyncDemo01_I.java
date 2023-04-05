package thread.thread_1;

public class SyncDemo01_I {
    public static void main(String[] args) {
        Table table = new Table();
        Thread t1 = new Thread("小紅") {
            @Override
            public void run() {
                while (true) {
                    int bean = table.getBeans();
                    System.out.println(getName() + "搶了一顆豆子，桌上還剩下" + (bean - 1) + "顆");
                }
            }
        };
        t1.start();

        Thread t2 = new Thread("小藍") {
            @Override
            public void run() {
                while (true) {
                    int bean = table.getBeans();
                    System.out.println(getName() + "搶了一顆豆子，桌上還剩下" + (bean - 1) + "顆");
                }
            }
        };
        t2.start();
    }
}

class Table {
    private int beans = 1000000;

    public synchronized int getBeans() {
        if (beans <= 0) {
            throw new RuntimeException("桌上沒有豆子了");
        }
        Thread.yield();//主動讓出
        return beans--;
    }
}