package thread.thread_2;

public class SyncDemo03_II {

    public static void main(String[] args) {
        Throat throat = new Throat();
        Thread t1 = new Thread("吞嚥作用進行中"){
            @Override
            public void run() {
                throat.eat();
            }
        };
        t1.start();

        Thread t2 = new Thread("呼吸作用正在進行中"){
            @Override
            public void run() {
                throat.breath();
            }
        };
        t2.start();

    }


}

class  Throat{
    public synchronized void eat(){
        try {
            Thread t = Thread.currentThread();
            System.out.println(t.getName() + "，食物正在經過咽喉");
            Thread.sleep(5000);
            System.out.println(t.getName() + "，食物通過完畢");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public synchronized void breath(){
        try {
            Thread t = Thread.currentThread();
            System.out.println(t.getName() + "，咽喉正在呼氣");
            Thread.sleep(5000);
            System.out.println(t.getName() + "，咽喉正在吐氣");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}