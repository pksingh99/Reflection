/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package reflectionpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 *
 * @author sumit sharma
 */
public class ReflectionClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException{
       
        Class c=Class.forName("reflectionpackage.My");
       
        Method m=c.getDeclaredMethod("myReflectionMethod");
        Object t = c.newInstance();
        Object o= m.invoke(t);
        
        
    }
}
