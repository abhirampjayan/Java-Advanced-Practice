package genericList;

public class Umain {
    public static void main(String[] args) {
        var max=Util.max(5,5);
        var omax=Util.max(new User(50),new User(40));
        System.out.println(max);
        System.out.println(omax);
        Util.print(5,"Abhiram");
    }
}
