package PrivateMethod;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionAPIdemo {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException {
        Class c =Class.forName("PrivateMethod.Test");
        Test t= (Test) c.newInstance();
        Method m =c.getDeclaredMethod("show",null);
        m.setAccessible((true));
        m.invoke(t,null);

    }
}
