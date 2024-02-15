/*
 * super() means calling the constructor of super class
 * we dont have to write super() to do that
 * it is present by default in sub class constructor and invokes automatically
 * this() is used to call the multiple (2) constructors with single object only
 * When we create object it is two steps 
 * Classname objname this is called reference
 * objname = new Classname is actual object creation and this object is presnet in heap memory
 * in short objname presents in stack or main memory
 * and objname refers to the new Classname()
 */

class a {
    public a() {
        System.out.println("Inside default a");
    }

    public a(int d) {
        System.out.println("Inside int a");
    }
}

class b extends a {
    public b() {
        super();// this is present by default we dont have to explicitly mention it
        System.out.println("Inside default b");
    }

    public b(int x, int y) {
        System.out.println("Inside int int b");
    }

    public b(int d) {
        // super(); // super is still present here
        this();
        /*
         * if you want invoke default and parameterize constructors with single object
         * creation
         * this(4,5) will also work but we cannot use this() multiple times
         */
        System.out.println("Inside int b");
    }

}

public class oops3 {
    public static void main(String[] args) {
        // b bb = new b(); // output will be a then b
        b bbb = new b(5); // output will be a then in int b

        // oops2 o = new oops2(); we can create object of another file class in diffent
        // files as well wow
        // and we dont need oops2.java file for this oops.class is enough for that
    }

}
