package thread;

/**
 * 獲取線程相關資訊的方法
 */
public class ThreadInfoDemo {
    public static void main(String[] args) {
        //獲取主線程
        Thread t = Thread.currentThread();
        System.out.println("主線程名為:" + t.getName());
        System.out.println("主線程ID:" + t.getId());//非空且唯一
        System.out.println("主線程優先級" + t.getPriority());
        System.out.println("主線程是否存活" + t.isAlive());
        System.out.println("主線程是否為守護線程" + t.isDaemon());
        System.out.println("主線程是否被中斷" + t.isInterrupted());


    }

}
