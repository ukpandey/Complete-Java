sealed class A permits B{
    public void showA(){
        System.out.println("A Hello");
    }
}
sealed class B extends A permits C{ // permit class should be final or sealed or non sealed
        public void showB(){
        System.out.println("B Hello");
    }
}

non-sealed class C extends B{
        public void showC(){
        System.out.println("C Hello");
    }
}

class D extends C{
    public void showD(){
        System.out.println("D Hello");
    }
    
}
public class SealedClasses {
    public static void main(String[] args) {
        D d = new D();
        d.showA();
        d.showB();
        d.showC();
        d.showD();
    }
}
