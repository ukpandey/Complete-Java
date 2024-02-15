import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class StreamAPIs1 {
    public static void main(String[] args){   
    	
    	List<Integer> nums=Arrays.asList(4,5,7,3,2,6);
    	
   	Stream<Integer> s1=nums.stream();
    // s1.forEach(n-> System.out.println(n));  // 4 5 7 3 2 6
    
    // Lets use filter method 
    // it takes predicate interface's refernce

    Predicate<Integer>  p = new Predicate<>(){
        public boolean test(Integer i){
            return i%2==0;
        }
    };
    Stream<Integer> s2 = s1.filter(p);
    // s2.forEach(n -> System.out.println(n));  // 4 2 6
//    	Stream<Integer> s2= s1.filter(n ->n%2==0);

    // Lets use reduce method
    // it takes function interface reference 

    Function<Integer, Integer> fun = new Function<>() {
        public Integer apply(Integer i){
            return i*3;
        }
    };
    Stream<Integer> s3 = s2.map(fun);
    // s3.forEach(n -> System.out.println(n)); // 12 6 18
//    	Stream<Integer> s3= s2.map(n->n*3);


    // // lets use reduce method now
    // BiFunction<Integer,Integer, Integer > b = new BiFunction<>() {
    //     public Integer apply(Integer i, Integer j){
    //         return i+j;
    //     }
        
    // };

    // not able to understand the implementation of reduce method ratta marle 
//    	int result=s3.reduce(0,(c,e)->c+e);
//    	
//    	s2.forEach(n -> System.out.println(n));
//    	s3.forEach(n -> System.out.println(n));
//    	
//    	s1.forEach(n-> System.out.println(n));
//   	s1.forEach(n-> System.out.println(n));
    	
    	// int result=nums.stream()
    	// 				.filter(n-> n%2==0)
    	// 				.map(n->n*2)
    	// 				.reduce(0, (c,e)-> c+e);
    	// System.out.println(result);
    	
    	
    }
}

