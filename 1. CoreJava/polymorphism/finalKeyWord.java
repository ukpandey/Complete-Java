/*
 * final is Const like c++
 * if a variable is final we can not modify that variable 
 * if a class is final that means it can not be extended
 * if a function is final it can't be override
 */
final class A{

}
/*
 * gives error
 class b extends A{

}
 */

class c1{
    public final void show(){
        System.out.println("in c1 show");
    }
}
class c2 extends c1{
    public void show(){ // gives error
        System.out.println("In b show");
    }
}

public class finalKeyWord {
    public static void main(String[] args) {
        final int a = 50;
        System.out.println(a);
        // a=70; // gives error
    }
}
