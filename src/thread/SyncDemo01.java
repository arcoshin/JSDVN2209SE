package thread;

/**
 * 多線程併發的安全問題
 * 當多個線程操作同一個臨界資源時，由於線程遷換的時機不確定
 * 導致操作順序出現混亂，而引起的各種邏輯錯誤
 * 臨界資源: 操錯該線程的完整過程，同時刻只能由單線程執行
 */
public class SyncDemo01 {
    public static void main(String[] args) {
        Table table = new Table();
        Thread t1 = new Thread("zs") {
            @Override
            public void run() {
                while (true) {
                    int bean = table.getBeans();
                    System.out.println(getName() + "搶了一顆豆子，桌子上還剩下" + (bean - 1) + "顆");
                }
            }
        };

        Thread t2 = new Thread("ls") {
            @Override
            public void run() {
                while (true) {
                    int bean = table.getBeans();
                    System.out.println(getName() + "搶了一顆豆子，桌子上還剩下" + (bean - 1) + "顆");
                }
            }
        };
        t1.start();
        t2.start();

    }
}

class Table {
    private int beans = 1000;

    public synchronized int getBeans() {
        /**
         * 當一個方法被synchronized修飾，則成為同步方法
         * 多個線程不能同時執行這個方法
         * 如果有一線程執行中，其他線程則進入鎖阻塞狀態
         * 直到當前線程執行完畢才可以繼續執行該方法
         *
         * 安全性有所大幅度提升，但有嚴重的效率問題
         */
        if (beans <= 0) {
            throw new RuntimeException("桌上已經沒有豆子了!");
        }
        /**
         * 主動讓出時間片(機率性禮讓線程)
         * 本該當前線程執行的代碼，會主動讓出時間片
         * 重新再讓CPU選擇哪條線程執行
         */
        Thread.yield();//線程們都有可能在此相讓，仍會有安全隱患
        return beans--;
    }
}