package threadpriority;

public class TDemo3 {
    public static void main(String[] args) throws InterruptedException {
        Thread t1= new Thread(()->{
            for (int i = 0; i < 5; i++) {
                System.out.println("Hello"+Thread.currentThread());
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        },"Hi Thd");
        Thread t2=new Thread(()-> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Hi"+Thread.currentThread());
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        },"Hello THD");
        System.out.println(t1.getName());
        t1.setPriority(Thread.MIN_PRIORITY);
        System.out.println(t1.getPriority());
        t2.setPriority(Thread.MAX_PRIORITY);
        System.out.println(t2.getName());
        System.out.println(t2.getPriority());
        t1.start();
        Thread.sleep(10);
        t2.start();

        t1.join();// main wait till t1 complete it's execution
        t2.join();// main wait till t1 complete it's execution

        System.out.println(t1.isAlive());
        System.out.println("Bye");
    }
}
