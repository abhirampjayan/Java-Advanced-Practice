package ThreadTrial;

public class TDemo3 {
    public static void main(String[] args) throws InterruptedException {
        Thread t1= new Thread(()->{
            for (int i = 0; i < 5; i++) {
                System.out.println("Hello");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        Thread t2=new Thread(()-> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Hi");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        t1.start();
        Thread.sleep(10);
        t2.start();

        t1.join(); // main wait till t1 complete it's execution
        t2.join();// main wait till t1 complete it's execution

        System.out.println(t1.isAlive());
        System.out.println("Bye");
    }
}
