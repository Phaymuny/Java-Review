package OOP;

public class encapsulation {
    public static void main(String[] args) {
       //Encapsulation = attributes of a class will be hidden or private
         //              Can be accessed only through methods (getters & setters)
        //               You should make attribute private if you don't have a reason to them public or protected.
        Car car = new Car("LamBo","Carmo",2015);
        Car car1 = new Car("Camery", "LM", 2022);
        System.out.println(car.getMake());
        System.out.println(car1.getModel());
    }
}
