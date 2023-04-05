package thread;

/**
 * 線程的同步與異步
 * 線程提供的join()方法，可以協調線程同步進行
 * 多線程是併發運行，本身是一種異步運行狀態
 * 異步:多個線程各自執行各自的
 * 同步:多個線程執行時，有先後順序
 */
public class JoinDemo {
    static boolean isFinish = false;//表示圖片是否下載完畢

    public static void main(String[] args) {
        Thread t1 = new Thread("下載線程") {
            @Override
            public void run() {
                System.out.println(getName() + ":正在開始下載圖片...");
                for (int i = 1; i < 100; i++) {
                    System.out.println("圖片已下載" + i + "%...");
                    try {
                        Thread.sleep(50);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(getName() + ":圖片下載已完成");
                isFinish = true;
            }
        };

        Thread t2 = new Thread("顯示線程") {
            @Override
            public void run() {
                System.out.println(getName() + ":正在開始顯示文字...");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                System.out.println(getName() + ":文字顯示已完成");
                /**
                 * 開始顯示圖片前 應該等待下載線程執行完畢後
                 * 才可以繼續執行顯示線程，此時兩線程是同步狀態
                 * 此時不能通過Thread.sleep()方法控制，因為無法預估阻塞時間
                 * 此時可以使用join()方法讓出CPU的時間片，主動讓下載線程執行
                 * 顯示線程進入阻塞狀態，直到下載線程結束!
                 */
                try {
                    t1.join();//口訣:插入要執行到結束的線程
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(getName() + ":開始顯示圖片");
                if (!isFinish){//尚未下載好，故顯示失敗
                    throw new RuntimeException("圖片下載失敗");
                }
                System.out.println(getName()+":圖片顯示完成");
            }
        };
        t1.start();
        t2.start();


    }
}
