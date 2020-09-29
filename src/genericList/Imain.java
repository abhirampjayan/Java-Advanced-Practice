package genericList;

public class Imain {
    public static void main(String[] args) {
        User user=new Instructor(20);
        Util.printUser(new Instructor(10));
        var instructors=new GenericList<Instructor>();
        var users=new GenericList<User>();
        //Util.printUser(new GenericList<Instructor>());
    }
}
