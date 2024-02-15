class A{
    public void show(){
        System.out.println("In A show");
    }
    // this  is inner class
    class B{
        public void config(){
            System.out.println("In inner A config");
        }
    }
}

class C{
    public void show(){
        System.out.println("In C show");
    }
}

abstract class D{
    public abstract void show();
}
public class InnverClass {
    public static void main(String[] args) {
        A a = new A();
        a.show();
        // a.config() not possible
        // B b = new B();  not possible

        A.B b = a.new B();
        b.config();
        
        // following is the examnple of anonymous innter class

        C c = new C()
        {
            public void show(){
                System.out.println("This is different c show");
            }
        };
        c.show();

        // if we dont want to create child class for abstract we can do following
        D d = new D(){
            public void show(){
                System.out.println("D show");
            }
        };
        d.show();

    }
}
