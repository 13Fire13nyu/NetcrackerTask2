package ru.ncedu.belash;


/** Главный класс, в котором реализуются методы класса ExtendedClass.
 *
 * @author Белаш М.В.
 */
public class MainClass {

    public static void main(String[] args){
        
        byte b=5, b1=3;
        int i=9352, i1=143;
        double d=0.234, d1= 242.12;
        String s="hello!", s1="world";
        
        ExtendedClass impl = new ExtendedClass(b,i,d,s);
        ExtendedClass impl1 = new ExtendedClass(b1,i1,d1,s1);
        System.out.println(impl1.equals(impl));
        System.out.println(impl.equals(impl));
        System.out.println(impl.equals(null));
        
        System.out.println(impl.toString());
        System.out.println(impl1.toString());
        
        System.out.println(impl.hashCode());
        System.out.println(impl1.hashCode());
        
    }
    
}
