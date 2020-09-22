package serial;

import java.io.*;

public class Seriali {
    public static void main(String[] args) throws Exception {
        Save obj= new Save();
        obj.a=4;

        File f=new File("obj.txt");
        FileOutputStream fss=new FileOutputStream(f);
        ObjectOutputStream oos=new ObjectOutputStream(fss);
        oos.writeObject(obj);

        FileInputStream fis=new FileInputStream(f);
        ObjectInputStream ois=new ObjectInputStream(fis);
        Save obj1= (Save) ois.readObject();
        System.out.println(obj1.a);
    }
}
class Save implements Serializable {
    int a;
}
