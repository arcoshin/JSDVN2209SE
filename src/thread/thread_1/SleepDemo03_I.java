package thread.thread_1;

public class SleepDemo03_I {
    public static void main(String[] args) {
        Thread t1 = new Thread("睡美人") {
            @Override
            public void run() {
                try {
                    System.out.println(getName() + ">>>來好好睡一覺~");
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    System.out.println(getName() + ">>>哀呀被吵醒了呢");
                }
                System.out.println(getName() + ">>>睡的真舒服~");

            }
        };
        t1.start();


    }
}
