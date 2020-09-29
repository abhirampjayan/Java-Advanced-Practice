package genericsAPJ;

public class GenMain {
    public static void main(String[] args) {
        var list=new List();
        list.add(Integer.valueOf(1));
        list.add("");


        int num=(int)list.get(0);
        System.out.println(num);
    }
}
