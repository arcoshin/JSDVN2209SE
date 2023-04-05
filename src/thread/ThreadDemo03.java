package thread;

/**
 * 使用匿名內部類完成兩種線程創建方式
 */
public class ThreadDemo03 {
    public static void main(String[] args) {
        //直接繼承Thread重寫run形式
        Thread t1 = new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    System.out.print("A");
                }
            }
        };

        //實現Runnable接口重寫run方法形式
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    System.out.print("B");
                }
            }
        };
        Thread t2 = new Thread(r1);
        t1.start();
        t2.start();

        //使用lambda表達式實現Runnable接口重寫run方法形式
        Runnable r2 = () -> {
            for (int i = 0; i < 1000; i++) {
                System.out.print("C");
            }
        };
        Thread t3 = new Thread(r2);
        t3.start();

    }
}
