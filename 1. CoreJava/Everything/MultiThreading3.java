class Count{
    int count=0;
    /*
     * synchronized is used so that threads doesn't excess function at same time
     * suppose count is 100 and both thread reached the function at the same time
     * and increased the value by +1 then it will be 101 but it should be 102
     */
    public synchronized void increment(){ 
        count++;
    }
}
public class MultiThreading3 {
    public static void main(String[] args) throws InterruptedException {
        Count c = new Count();
        Runnable obj = () ->{
            for(int i=1; i<=10000; i++){
                c.increment();
            }
        };

        Runnable obj2 = () ->{
            for(int i=1; i<=10000; i++){
                c.increment();
            }
        };
        Thread T1 = new Thread(obj);
        Thread T2 = new Thread(obj2);
        T1.start();
        T2.start();
        T1.join(); // this is like await in javascript
        T2.join(); // jab tak t1 and t2 apna kaam nhi karlete aage kuch nhi hoga
        System.out.println(c.count);
        System.out.println("Sab kuch hogya bhai ");
    }
}
