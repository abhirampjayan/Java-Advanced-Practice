public class Clone {
    public static void main(String[] args) throws CloneNotSupportedException {
        Class1 obj=new Class1();
        obj.i=8;
        obj.j=7;
        Class1 obj1= (Class1) obj.clone();
        System.out.println(obj);
        System.out.println(obj1);
        obj.j=9;
        System.out.println(obj);
        System.out.println(obj1);
    }
}
class Class1 implements Cloneable {
    int i;
    int j;

    @Override
    public String toString() {
        return "OBJ: "+i+", "+j;
    }
    @Override
    public Object clone() throws  CloneNotSupportedException{
        return super.clone();
    }
}