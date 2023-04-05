package thread.thread_1;

public class ThreadInfoDemo_I {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        System.out.println("當前線程名稱" + t.getName());
        System.out.println("ID=" + t.getId());
        System.out.println("優先級=" + t.getPriority());

        System.out.println("是否存活?" + t.isAlive());
        System.out.println("是否為守護線程" + t.isDaemon());
        System.out.println("是否被中斷" + t.isInterrupted());
    }
}
