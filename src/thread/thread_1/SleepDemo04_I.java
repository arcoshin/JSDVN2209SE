package thread.thread_1;

public class SleepDemo04_I {
    public static void main(String[] args) {
        Thread t1 = new Thread("睡美人"){
            @Override
            public void run() {
                System.out.println(getName()+">>>來好好睡一覺~");
                try {
                    Thread.sleep(10000);
                    System.out.println(getName()+">>>睡的真舒服~");
                } catch (InterruptedException e) {
                    System.out.println(getName()+">>>居然被叫醒了呢");
                }
            }
        };


        Thread t2 = new Thread("鬧鐘"){
            @Override
            public void run() {
                System.out.println(getName()+"一個整點鬧鈴任務");
                for (int i = 0; i < 5 ; i++) {
                    System.out.println(getName()+">>>起床~起床~起床~");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(getName()+">>>不會吧?真的起床了?");
                System.out.println(getName()+">>>哀呀~不好意思叫錯人了");
                t1.interrupt();
            }
        };
        t1.start();
        t2.start();








    }
}
