class Student{
    private String name;
    private int age;
    private int rno;
    public Student(){
        name = "Default name";
        age = 22;
        rno = 37;
    }

    public Student(String name, int age, int rno){
        this.name = name;
        this.age = age;
        this.rno = rno;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getRno() {
        return rno;
    }
    public void setRno(int rno) {
        this.rno = rno;
    }

    
}

public class oops2 {
    public static void main(String[] args) {
        Student s = new Student();
        System.out.println(s.getName() +":"+ s.getRno() +":"+ s.getAge());
        Student s2 = new Student("Ujjwal", 22, 56);
        System.out.println(s2.getName() +":"+ s2.getRno() +":"+ s2.getAge());
        s2.setName("Eren");
        s2.setAge(18);
        s2.setRno(45);
        System.out.println(s2.getName() +":"+ s2.getRno() +":"+ s2.getAge());
    }
}
