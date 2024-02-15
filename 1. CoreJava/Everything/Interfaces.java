/*
 * As we can see we have 2 methods in the abstract class
 * and both the methods are abstract
 * to define these methods we have to define them in child class 
 * but if want only abstract functions then we have better alternative than class 
 * and it is interface 
 * There are 3 types of interfaces in java 
 * normal -> an inteface with multiple methods
 * functional -> an interface with single method
 * marker -> empty interface with no methods, mostly used for serilization and deserialization
 */
// abstract class Xyz{
//     public abstract void f1();
//     public abstract void f2();
// }

interface Xyz{
    void f1();
    void f2(); 
    // by default methods are public abstract in them 
    String s = "Ujjwal";
    int n = 5; 
    // by default the data members are final static 
    // if it is final that it will be constant and we have to initialize it
    // if it is static that means we can access it with the interface name
}

interface xyz2{
    void f3();
}

class  demo implements Xyz,xyz2{

    public void f1() {
        System.out.println("Implemented f1");
        
    }
    public void f2() {
        System.out.println("Implemented f2");
    }
    public void f3(){
        System.out.println("Implemented f3");
    }

}

interface A{
    void show1();
    void show2();
}

interface B{
    void show3();
}
interface C extends A,B{
    void show4();
}

class demo2 implements C{

    @Override
    public void show4() {
        System.out.println("Show4");
        
    }

    @Override
    public void show1() {
        System.out.println("Show1");
        
    }

    @Override
    public void show2() {
        System.out.println("Show2");
        
    }

    @Override
    public void show3() {
        System.out.println("Show3");
        
    }
    
}

public class Interfaces {
    public static void main(String[] args) {
        Xyz x; // we can create the refernce of the interface but not object
        x = new demo();
        x.f1();
        x.f2();
        // x.f3() gives error because f3 is present in different interface 

        xyz2 x2 = new demo();
        x2.f3();
        System.out.println(Xyz.n +":"+ Xyz.s);

        C c;
        c = new demo2();
        c.show1();
        c.show2();
        c.show3();
        c.show4();
    }
}
