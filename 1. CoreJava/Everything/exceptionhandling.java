public class exceptionhandling {
    public static void main(String[] args) {
        int i , j;
        i = 0;
        j = 5;
        int[] arr = new int[5];
        try{
            j = j/i;
            System.out.println(j);
            System.out.println(arr[6]);
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
