package thread.thread_1;

public class SyncDemo03_I {
    public static void main(String[] args) {
        Throat throat = new Throat();
        Thread t1 = new Thread("吃飯") {
            @Override
            public void run() {
                throat.eat();
            }
        };
        t1.start();

        Thread t2 = new Thread("呼吸") {
            @Override
            public void run() {
                throat.breath();
            }
        };
        t2.start();
    }
}

class Throat {//咽喉類

    public synchronized void eat() {
        try {
            Thread t = Thread.currentThread();
            System.out.println(t.getName() + "開始通過咽喉");
            Thread.sleep(5000);
            System.out.println(t.getName() + "吞嚥完畢");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public synchronized void breath() {
        try {
            Thread t = Thread.currentThread();
            System.out.println(t.getName() + "開始通過咽喉");
            Thread.sleep(5000);
            System.out.println(t.getName() + "呼吸完畢");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}