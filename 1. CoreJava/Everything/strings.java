public class strings {
    public static void main(String[] args) {
        String s = "Ujjwal";
        System.out.println(s);
        s = s + "Pandey";
        System.out.println(s); // Ujjwal Pandey
        // By default string is immutable
        // what is happening above is tha s is just a reference which is first pointing
        // to the object Ujjwal
        // after that s is pointing to the new object Ujjwal Pandey
        // so Ujjwal is not changed but a new object has been created
        // which is pointing to Ujjwal Pandey , when the garbage collector runs it will
        // remove the free object Ujjwal

        StringBuffer sb = new StringBuffer("Hello");
        System.out.println(sb);
        System.out.println(sb.length());
        System.out.println(sb.capacity()); // 16+5 = 21
        sb.insert(0, "Hi "); //Hi Hello
        System.out.println(sb);
        sb.append(12.5);
        System.out.println(sb);
        StringBuilder st = new StringBuilder("Ujjwal");
    }
}
