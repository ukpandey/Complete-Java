public class MultiThreading2 {
    public static void main(String[] args) {
        Runnable obj = new Runnable() {
            public void run(){
                for(int i=0; i<5; i++){
                    System.out.println("Hello ji ");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };

        Runnable obj2 = () ->{
            for(int i=0; i<5; i++){
                System.out.println("Namaste ji ");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        Thread T1 = new Thread(obj);
        Thread T2 = new Thread(obj2);

        T1.start();
        T2.start();
        
    }
}
