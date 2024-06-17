package Practice.Inheritance.Inheritance;

public class Dog extends Animal{
    String name = "Kiki";

    @Override
    void makeSound() {
        System.out.println("Woof, Woof");
    }
}
