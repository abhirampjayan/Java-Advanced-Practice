package ex;

public class Exar {
    public static void main(String[] args) {
        int a,b,c=0;
        int k[] = new int[4];
        a=5;
        b=0;
        try {
            c=a/b;
            for (int i = 0; i<=5; i++) {
                k[i]=i+1;
            }
            for (int value:
                 k) {
                System.out.println(value);
            }
        }
        catch (ArithmeticException e){
            System.out.println("Can't divided by zero : "+e);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Max no:of value is 4 : "+e);
        }
        catch (Exception e){
            System.out.println("Unknown");
        }
        System.out.println(c);
        for (int value:
                k) {
            System.out.println(value);
        }
    }
}
