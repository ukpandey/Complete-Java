public class loops {
    public static void main(String[] args) {
        int i = 0;
        while(i<5)
            System.out.println(i++);

        do{
            System.out.println("i:" + i);
        }while(i<5);

        for(int j=0; j<6; j++){
            System.out.print(j + " ");
        }
    }
}
