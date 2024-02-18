// package polymorphism;
class Mobile {
    String brand;
    int price;

    // static variables are class member not object member
    static String name; // static variables are common for all the objects
    // all the objects shares the common static variable.

    // in non static function we can use static variables
    public void show() {
        System.out.println(brand + ":" + price + ":" + name);
    }
}

class car {
    String brand;
    int price;
    static String name;

    // this block will executed only once and we can not initalize non static
    // members in it.
    static {
        name = "racing";
        System.out.println("Inside static block");
    }

    // we can initialize the static variables in constructors as well
    // problem is that everytime we create the object it re-initializes
    public car() {
        brand = "Buggati";
        price = 9999;
        // name = "sports";
        System.out.println("Inside constructor");
    }

    public void show() {
        System.out.println(brand + ":" + price + ":" + name);
    }

    // public static void show2(){
    //     System.out.println("Inside static function");
    //     System.out.println(brand + ":" + price + ":" + name);
    //     //since brand and price is instance member we require to pass instance to it as argumnent
    //     // in this function, without that function will confuse and throws error 
    // }

        public static void show2(car c){
        System.out.println("Inside static function");
        System.out.println(c.brand + ":" + c.price + ":" + name); 
    }

    
}

public class statickeyword {

    /*
     * if we remove static from main function we have to create object of the class
     * but the problem is our starting point is main itself
     * so to avoid this problem we use static
     */
    public static void main(String[] args) throws ClassNotFoundException {
        Mobile M1 = new Mobile();
        M1.brand = "Apple";
        M1.price = 5000;
        // M1.name = "SmartPhone"; // this will work too
        Mobile.name = "Smartphone"; // since static variables are class members therefore we can
        // access them using classname

        Mobile M2 = new Mobile();
        M2.brand = "Samsung";
        M2.price = 5000;
        Mobile.name = "SmartPhone";

        M1.show();
        M2.show();

        M1.name = "Phone"; // if we do this name will be phone for m2 as well
        M1.show();
        M2.show();

        /*
         *everytime we create objects the class loads
         * loading of class happens only once
         * Static block code executes only once during the class loading. The static
         * blocks always execute first before the main() method in Java because the
         * compiler stores them in memory at the time of class loading and before the
         * object creation
         * class will not load if we dont create the objects and hence static 
         * block will not be executed
         */

        car c1 = new car();
        car c2 = new car();
        car c3 = new car();
        c1.show();
        c2.show();
        c3.show();

        // we can load the class without creating objects with this class
        // but we have to do exception handling for that
        // classnotfoundexception
        // Class.forName("car"); // normally we dont use it we use it in jdbc

        car.show2(c3);
    }
}
