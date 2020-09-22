package ThreadTrial;

class Hello1 implements Runnable{
    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Hi1 implements Runnable{
    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println("Hi");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
public class TDemo2 {
    public static void main(String[] args) throws InterruptedException {
        Hi1 obj1=new Hi1();
        Hello1 obj2=new Hello1();
        Thread t1= new Thread(obj1);
        Thread t2=new Thread(obj2);
        t1.start();
        Thread.sleep(10);
        t2.start();
    }
}
