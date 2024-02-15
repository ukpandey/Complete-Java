class Calc{
    int n;
    public int add(int x, int y){
        return x+y;
    }
    public int add(int x, int y, int z){
        return x+y+z;
    }
}

public class oops {
    public static int add(int a, int b){
        return a+b;
    }
    public static void main(String[] args) {
        Calc C = new Calc();
        int ans = C.add(6,7);
        System.out.println(ans);
        ans = C.add(1,2,3);
        System.out.println(ans);
        System.out.println(add(ans, ans));
    }
}
