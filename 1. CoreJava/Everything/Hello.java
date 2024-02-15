class Hello{
    public static void main(String[] args) {

        // int num = 0;
        // byte b = 127;
        // short sh = 455;
        // long l = 5554l;

        // float f = 12.5f;
        // double d = 12.5;

        // char c = 'a';

        // boolean bo = true;
        // System.out.println(num + c);

        byte b = 12;
        int a = 75;
        b = (byte)a;
        System.out.println(b);
        a = 257;
        b = (byte) a;
        System.out.println(b); // 1 because when out of range it gets %256
        a = 0;
        System.out.println(a +" " + a++ +" " + ++a +" " + a-- +" " + --a +" "+ a +" "+ ++a);
        double d = 6;
        int x = 6;
        System.out.println(d==x); //true

    }
}