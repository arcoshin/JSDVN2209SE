package thread;

/**
 * java中所有代碼都是靠線程運行的，main方法也不例外
 * JVM啟動會後自動生程線程
 * 執行main方法，並且該線程的名稱就叫做main，因此稱為主線程
 * 但主線程跟我們自己創建的線程沒有什麼區別
 * <p>
 * static Thread currentThread();
 * 該方法可以獲得執行方法的線程
 */
public class CurrentThreadDemo {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        System.out.println("主線程" + t);

        Thread t2 = new Thread("此處可以設定線程名") {
            @Override
            public void run() {
                Thread t = Thread.currentThread();
                System.out.println(t);
            }
        };
        t2.start();
    }
}
