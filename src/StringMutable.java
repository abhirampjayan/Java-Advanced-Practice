public class StringMutable {
    public static void main(String[] args) {
        StringBuffer str=new StringBuffer("Abhiram");
        System.out.println(str);
        str.append(" P");
        System.out.println(str);
        System.out.println(str.length());
        str.delete(1,2);
        System.out.println(str);
    }
}
