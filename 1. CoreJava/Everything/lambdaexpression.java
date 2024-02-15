@FunctionalInterface
interface A{
    void show();
}

@FunctionalInterface
interface B{
    int add(int i, int j);
}
public class lambdaexpression {
    public static void main(String[] args) {

        // Before lamda expression
        A a = new A(){
            public void show(){
                System.out.println("Hello ji");
            }
        };
        a.show();

        A obj = ()->{
            System.out.println("Lambda hooon");
            // if there is only one statement you can remove the curly brackets
        };
        obj.show();

        B b = (i,j) ->{
            return i+j;
        };
        System.out.println(b.add(4,5));

        B b2 = (i,j) -> i+j;
        System.out.println(b2.add(4,9));
        
    }
}
