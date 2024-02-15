enum Status{
    Running, Failed, Pending, Success;
}

enum Laptop{
    Mackbook(1000), Dell(400), HP;
    private int price;

    private Laptop(){
        price = 0;
        System.out.println("In default laptop " + this.name());
    }
    private Laptop(int price){
        this.price = price;
        System.out.println("In laptop: "+ this.name());
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
}
public class Enums {
    public static void main(String[] args) {
        Status s = Status.Success;
        System.out.println(s);
        Status[]  s2 = Status.values();
        for(Status i: s2){
            System.out.println(i +":"+ i.ordinal());
        }


        for(Laptop l:Laptop.values()){
            // l.setPrice(999);
            System.out.println(l +":"+ l.getPrice());
        }
    }
}
