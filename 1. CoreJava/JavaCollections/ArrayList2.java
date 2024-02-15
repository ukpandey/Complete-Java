import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ArrayList2 {
    public static void main(String[] args) {
        List<Integer> ls =  Arrays.asList(1,2,3,4,5,6);
        System.out.println(ls);

        ls.forEach(n-> System.out.println(n));  // for each accepts the reference of consumer interface

        // lets see what happens behind the scene 
        Consumer<Integer> c = new Consumer<>() {
            public void accept(Integer i){
                System.out.println(i);
            }
        };
        ls.forEach(c);

        // Consumer<Integer> c2 = (i) ->{
        //     System.out.println(i);
        // };
        // above stmnt can be modified to this

        Consumer<Integer> c2 = i -> System.out.println(i);
        ls.forEach(c2);

    }
}
