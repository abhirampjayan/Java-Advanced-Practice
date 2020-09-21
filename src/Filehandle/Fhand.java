package Filehandle;

import java.io.*;

public class Fhand {
    public static void main(String[] args) throws Exception {
        File file=new File("home.txt");
        FileOutputStream fos=new FileOutputStream(file);
        DataOutputStream dos=new DataOutputStream(fos);
        dos.writeUTF("Abhiram");

        FileInputStream fis=new FileInputStream(file);
        DataInputStream din=new DataInputStream(fis);
        String str=din.readUTF();
        System.out.println(str);

    }
}
