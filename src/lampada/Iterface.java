package lampada;

 //functional interface can only have one method ; 
 //you can not create the object of an interface but yes you can create 
 //the implemetation than create the object of an interface. 
 //You can implement the toString() to a class it not error because toString() is already part of any class. 
@FunctionalInterface
interface InnerIterface {
    void show(); 
    String toString(); 
}

/* class A implements InnerIterface{
   public void show(){
        System.out.println("Hello");
    }
} */

public class Iterface {
    //InnerIterface cat = new Iterface(); 
    public static void main(String[] args) {

        //this how to create the anynomous class in java. 
        InnerIterface clA = new InnerIterface() {
            public void show(){
                System.out.println("Some Text");
            }            
        }; 
        clA.show();
        // this how to create lambda expression & it can replace the anymous class above it make your code
        //shorter. 
        InnerIterface clB = () -> System.out.println("Some Text in lambda");
        clB.show();
    }
}
