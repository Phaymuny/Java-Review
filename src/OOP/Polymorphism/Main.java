package OOP.Polymorphism;

public class Main {
    public static void main(String[] args) {
        //polymorphism is greek for many
        // is the ability of an object to identify as more than one type
        // Polymorphism is one of the core concepts of OOP, which refers to the ability of an object to take
        // on many forms or perform different behaviors depending on the context. In Java, Polymorphism can
        // be achieved in two ways: method overloading and method overriding.

        Car car = new Car();
        Bike bike = new Bike();
        Boat boat = new Boat();
        Vichicles[] racer = {car,bike,boat};

    }
}
