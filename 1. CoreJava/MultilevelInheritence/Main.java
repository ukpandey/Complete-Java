/*
 * Multiple inheritence is not supported by java
 * assume we have class a and class b and another class c
 * which extends class a,b
 * now assume we have function show() in class a and b both
 * now the compiler cant decide which show() to call
 * and this is called ambiguity therefore we cannot use
 * multiple inheritence dierectly
 */

package MultilevelInheritence;

public class Main {
    public static void main(String[] args) {
        // Create objects of each calculator class
        // BasicCalc basicCalc = new BasicCalc();
        // AdvanceCalc advanceCalc = new AdvanceCalc();
        // VeryAdvanceCalc veryAdvanceCalc = new VeryAdvanceCalc();

        // // Use methods from BasicCalc
        // int sum = basicCalc.add(10, 5);
        // int difference = basicCalc.sub(10, 5);
        // System.out.println("Sum: " + sum);
        // System.out.println("Difference: " + difference);

        // // Use methods from AdvanceCalc
        // double product = advanceCalc.mult(10, 5);
        // double quotient = advanceCalc.div(10, 5);
        // System.out.println("Product: " + product);
        // System.out.println("Quotient: " + quotient);

        // // Use methods from VeryAdvanceCalc
        // double result = veryAdvanceCalc.power(2, 3);
        // System.out.println("Power: " + result);

        VeryAdvanceCalc v = new VeryAdvanceCalc();
        System.out.println(v.add(4, 5));
        System.out.println(v.sub(7, 7));
        System.out.println(v.mult(4, 6));
        System.out.println(v.div(78, 5));
        System.out.println(v.power(49, 0.5));
    }
}

// to run this file first we have to do this
// cd ..
// javac MultilevelInheritence/*.java
// java MultilevelInheritence.Main

/*
 * 
 * If you want to compile Main.java while being in the MultilevelInheritence
 * directory itself, you need to ensure that the compiler knows where to find
 * the other classes (BasicCalc, AdvanceCalc, VeryAdvanceCalc). You can do this
 * by including the parent directory of MultilevelInheritence in the classpath.
 * 
 * Assuming your directory structure is as follows:
 * 
 * css
 * Copy code
 * - MultilevelInheritence/
 * ├── BasicCalc.java
 * ├── AdvanceCalc.java
 * ├── VeryAdvanceCalc.java
 * └── Main.java
 * And you're currently inside the MultilevelInheritence directory, you can
 * compile Main.java along with all other .java files using the following
 * command:
 * 
 * bash
 * Copy code
 * javac -cp .. *.java
 * Explanation:
 * 
 * javac: This command is used to compile Java source files.
 * -cp ..: This option specifies the classpath, indicating to the compiler that
 * it should look for classes in the parent directory (..).
 * .java: This tells the compiler to compile all .java files in the current
 * directory (MultilevelInheritence).
 * After compiling, you can run your Main class from the MultilevelInheritence
 * directory:
 * 
 * bash
 * Copy code
 * java Main
 * This should resolve the issue and allow you to compile and run your program
 * successfully from the MultilevelInheritence directory.
 * if java Main doesnt work use this
 * java -cp .. MultilevelInheritence.Main
 */