class A extends Thread{
    public void run(){
        for(int i=0; i<100; i++){
            System.out.println("Hi A");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class B extends Thread{
    public void run(){
        for(int i=0; i<100; i++){
            System.out.println("Hello B");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class C implements Runnable{
    public void run(){
        for(int i=0; i<100; i++){
            System.out.println("Ha C");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        
    }
}
public class MultiThreading {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        // a.start();
        a.start(); // run() karega toh pehle a chalega fir b ptanhi kyu
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        b.start();
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        c.run();

        // if you want to use start() instead of run then do this
        /*
         * if you go to thread class if you will there is a constructor
         * which takex runnable object
         */
        Runnable objc = new C();
        Thread T = new Thread(objc);
        T.start();

        
    }
}
