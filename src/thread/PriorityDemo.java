package thread;

/**
 * priority : 優先級
 * 線程的優先級
 * 線程有10個優線級，最低的優先級為10，最低為1
 * 默認優先級為5
 * 線程經過Start的調用。會被納入線程調度器中統一管理
 * 被CPU分配時間片來多線程運行，線程不能主動索要時間片
 * 調度器原則上將時間片盡可能分配給不同線程
 * 如果有些線程需要執行的機率更大一些，就可以利用優先級改善獲取時間片的次數
 * 原則上，優先級越高，獲取時間片段的概論就越大
 * //但隨著多核心時代的到來，多核心變成不那麼準確了，因為是"真正"的多線程
 */
public class PriorityDemo {
    public static void main(String[] args) {
        Thread min = new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    System.out.println("我是優先級最低的線程，原則上最晚被執行完");
                }
            }
        };

        Thread nor = new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    System.out.println("我是優先級普通的線程");
                }
            }
        };

        Thread max = new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    System.out.println("我是優先級最高的線程，原則上最早被執行完");
                }
            }
        };
        min.setPriority(1);//設定優先級
        max.setPriority(10);//設定優先級
        min.start();
        nor.start();
        max.start();

    }
}
