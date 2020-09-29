package genericList;

public class Util {
    public  static <T extends Comparable<T>> T max(T first,T secound){
        return (first.compareTo(secound)<0)? secound:first;
    }
    public static <K,V> void print(K key,V value){
        System.out.println(key+"="+value);
    }
    public static void printUser(User user){
        System.out.println(user);
    }
    public static void printUser
            (GenericList<? super User> user){
        GenericList<Object> tmp=new GenericList<>();


    }
}
