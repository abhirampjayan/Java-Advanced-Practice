package Filehandle;

import javax.naming.Name;
import java.io.*;
import java.util.Properties;

public class App {
    public static void main(String[] args) throws Exception {
        Properties p=new Properties();
        OutputStream os=new FileOutputStream("config.properties");

        p.setProperty("Name","Abhiram");
        p.setProperty("age","22");
        p.setProperty("Username","abhirampjayan");
        p.store(os,"Details");
        InputStream is=new FileInputStream("config.properties");
        p.load(is);
        System.out.println(p.getProperty("Name"));
        p.list(System.out);
    }
}
