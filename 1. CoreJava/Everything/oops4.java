class class1{
    public class1(){
        System.out.println("In default 1");
    }
}

class class2 extends class1{
    public class2(int x, int y){
        //super() is still present baby
        this();
        System.out.println(x +" "+ +y);
    }
    public class2(){
        System.out.println("In default 2");
    }
}
public class oops4 {
    public static void main(String[] args) {
        class2  c2 = new class2(4, 5);
    }
    
}
