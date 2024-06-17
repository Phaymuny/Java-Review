package OOP;

public class CopyObject {
    public static void main(String[] args) {
        Car car = new Car("LamBo","Carmo",2015);
        Car car1 = new Car("Camery", "LM", 2022);
        System.out.println(car.getMake());
        System.out.println(car.getModel());
        System.out.println(car.getModel() );
        System.out.println(car1.getModel());
    }
}
