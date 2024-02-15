// package polymorphism;

class A {
    public void show() {
        System.out.println("In A show");
    }
}

class B extends A {
    public void show() {
        System.out.println("In B show");
    }
}

class C extends A {
    public void show() {
        System.out.println("In C show");
    }
}

public class demo {
    public static void main(String[] args) {
        // dynmaic method dispatch
        /*
         * this is called dynamic method dispatch or runtime polymorphism
         * at runtime we are not sure which overrided function will run
         */

        A a = new A();
        a.show();
        a = new B();
        a.show();
        a = new C(); // this is called upcasting and behind the scenes this happens A obj = (A) new B()
        a.show();

        C c = (C) a; // this is called downcasting
        c.show();
    }
}
