package thread.thread_1;

public class PriorityDemo_I {
    public static void main(String[] args) {
        Thread min = new Thread(){
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    System.out.print("A");
                }
            }
        };

        Thread nor = new Thread(){
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    System.out.print("B");
                }
            }
        };

        Thread max = new Thread(){
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    System.out.print("C");
                }
            }
        };
        min.setPriority(1);
        max.setPriority(10);
        min.start();
        nor.start();
        max.start();



    }
}
