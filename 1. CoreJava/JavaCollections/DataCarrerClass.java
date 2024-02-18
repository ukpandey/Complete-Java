// class Alien{
//     private final int age;
//     private final String name;
//     public Alien(int age, String name) {
//         this.age = age;
//         this.name = name;
//     }
//     public int getAge() {
//         return age;
//     }
//     public String getName() {
//         return name;
//     }
//     @Override
//     public String toString() {
//         return "Alien [age=" + age + ", name=" + name + "]";
//     }
//     @Override
//     public int hashCode() {
//         final int prime = 31;
//         int result = 1;
//         result = prime * result + age;
//         result = prime * result + ((name == null) ? 0 : name.hashCode());
//         return result;
//     }
//     @Override
//     public boolean equals(Object obj) {
//         if (this == obj)
//             return true;
//         if (obj == null)
//             return false;
//         if (getClass() != obj.getClass())
//             return false;
//         Alien other = (Alien) obj;
//         if (age != other.age)
//             return false;
//         if (name == null) {
//             if (other.name != null)
//                 return false;
//         } else if (!name.equals(other.name))
//             return false;
//         return true;
//     }

    
// } 

//The above class can be simplified to this 
record Alien(int age, String name)
{
    // by defaul the constructor is present in it
    // and obviously by default the data members are private final
}
public class DataCarrerClass {
    public static void main(String[] args) {
        Alien a1 = new Alien(23, "Ujjwal");
        Alien a2 = new Alien(23, "Ujjwal");
        System.out.println(a1.equals(a2));
        System.out.println(a1.age());
    }
}
