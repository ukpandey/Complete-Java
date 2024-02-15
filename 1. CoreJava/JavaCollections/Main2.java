import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student {
    int age;
    String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }
    /*
     * If you want to represent any object as a string, toString() method comes into
     * existence.
     * 
     * The toString() method returns the String representation of the object.
     * 
     * If you print any object, Java compiler internally invokes the toString()
     * method on the object. So overriding the toString() method, returns the
     * desired output, it can be the state of an object etc. depending on your
     * implementation.
     */

    public String toString() {
        return "Student [age=" + age + ", name=" + name + "]";
    }

}

class Employee implements Comparable<Employee>{
    int age;
    String Name;
    public Employee(int age, String name) {
        this.age = age;
        Name = name;
    }
    public String toString() {
        return "Employee [age=" + age + ", Name=" + Name + "]";
    }
    
    public int compareTo(Employee that){
        if(this.age > that.age)
            return 1;
        else
            return -1;
    }
}

public class Main2 {
    public static void main(String[] args) {
        // Comparator<Integer> comp = new Comparator<Integer>() {
        // public int compare(Integer i, Integer j){

        // if(i%10 > j%10)
        // return 1;
        // else
        // return -1;
        // }
        // };
        // List<Integer> nums = new ArrayList<>();
        // nums.add(61);
        // nums.add(32);
        // nums.add(13);
        // nums.add(24);

        // System.out.println(nums);
        // Collections.sort(nums);
        // System.out.println(nums);

        // // if we want to sort according to the last digit
        // Collections.sort(nums,comp);
        // System.out.println(nums);
        List<Student> sl = new ArrayList<>();
        sl.add(new Student(14, "Ujjwal"));
        sl.add(new Student(22, "Sunny"));
        sl.add(new Student(32, "Raj"));
        sl.add(new Student(18, "Aditya"));

        for (Student S : sl) {
            System.out.println(S);
        }

        Comparator<Student> cmp = new Comparator<Student>() {
            public int compare(Student s1, Student s2){
                if(s1.age > s2.age)
                    return 1;
                else
                    return -1;
            }
        };
        Collections.sort(sl,cmp);
        for (Student S : sl) {
            System.out.println(S);
        }

        List<Employee> el = new ArrayList<>();
        el.add(new Employee(34, "Rahul"));
        el.add(new Employee(23,"Sahul"));
        el.add(new Employee(67, "Abhishek"));

        for(Employee e:el){
            System.out.println(e);
        }

        Collections.sort(el);

        for(Employee e:el){
            System.out.println(e);
        }


    }
}
