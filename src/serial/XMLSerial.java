package serial;

import java.beans.XMLEncoder;
import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class XMLSerial {
    public static void main(String[] args) throws Exception {
        try {
            Student st1=new Student();
            st1.setRollno(101);
            st1.setSname("Abhi");
            Student st2=new Student();
            st2.setRollno(102);
            st2.setSname("Ram");

            List<Student> s= new ArrayList<>();
            s.add(st1);
            s.add(st2);

            College c=new College();
            c.setStudents(s);
            XMLEncoder x=new XMLEncoder(new BufferedOutputStream(new FileOutputStream("Mycollege.xml")));
            x.writeObject(c);
            x.close();
        } catch (FileNotFoundException ex) {
            System.out.println("Error");
        }
    }
}
