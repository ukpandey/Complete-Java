class UjjwalException extends Exception{
    public UjjwalException(String str){
        super(str);
    }
}
public class exceptionhandling2 {
    public static void main(String[] args) {
        int i=10;
        int j = 9;
        try{
            j = j/i;
            if(j==0){
                // throw new ArithmeticException("I dont want to print 0");
                throw new UjjwalException("Ujjwal exception");
            }
        }
        catch(ArithmeticException e){
            j = 9/1;
            System.out.println("This is default value");
        }
        catch(Exception e){
            System.out.println("Something went wrong "+ e);
        }
    }
}
