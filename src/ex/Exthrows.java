package ex;


public class Exthrows {
    public static void main(String[] args){
        int i=5;
        try {
            if (i<10){
                throw new MyExceptions("Error Found");
            }
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
class MyExceptions extends  Exception{
    public  MyExceptions(String msg){
        super(msg);
    }
}