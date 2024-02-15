// package polymorphism;

/*
 * suppose we have to only declare the function but we dont want to define it
 * for that we use abstract keyword for function]
 * but to declare abstract function we should have abstract class
 * ans abstract class cannot be instantiaited 
 * when we extend abstract class it is compulsory to 
 * define the abstract function in it
 */

 abstract class A{
    public abstract void show();
    public void show2(){
        System.out.println("In a show 2");
    }
 }
 class B extends A{
    public void show(){
        System.out.println("Show defined");
    }
 }
public class abstractKeyWord {
    public static void main(String[] args) {
        B b = new B();
        b.show();
        b.show2();
    }
    
}
