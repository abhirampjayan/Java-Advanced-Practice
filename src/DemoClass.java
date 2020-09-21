import java.util.ArrayList;

public class DemoClass {
    public static void main(String[] args) {
        int i = 5;
        Integer ii = new Integer(50);
        System.out.println(i);
        System.out.println(ii);
        int k = ii;
        int kk = ii.intValue();
        System.out.println(k + " " + kk);
        ArrayList<Integer> val = new ArrayList<Integer>();
        ArrayList str = new ArrayList();
        str.add("Hello");
        val.add(5);
        val.add(7);
        System.out.println(val);
        System.out.println(str);
    }
}
