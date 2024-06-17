package Enum;

//Enum is data type that represent a group od constants. 

enum Status {
    Running, Failed, Pending, Success;
}

enum Laptop {

    Macbook(2000), XPS(2200), Surface(500), ThinkPad(1800);

    private int price;

    private Laptop(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}

public class Main {
    public static void main(String[] args) {
        int i = 5;
        Status s = Status.Running;
        System.out.println(s);
        System.out.println(s.ordinal());

        Status[] ss = Status.values();
        System.out.println(ss[0]);

        for (Status status : ss) {
            System.out.println(status);
        }

        Laptop lap = Laptop.Macbook;
        System.out.println(lap + " : " + lap.getPrice());
        System.out.println();
        for (Laptop lap1 : Laptop.values()) {
            System.out.println(lap1+" Price : " + lap1.getPrice());
        }

    }
}
