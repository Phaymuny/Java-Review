package Lambda;
public class Main {
    public static void main(String[] args) {
        //lambda expression: is feature for java 8 and above also known as
        //                  an anonymous class with only one method
        String name = "bro";
        char symbol = '!';
        int strl = name.length();
        System.out.println(strl);
        //apply lambda expression using user define:
        MyInterface myInterface = (x,y) -> {
            System.out.println("Hello world!");
            System.out.println("This is a nice day ! "+x + y);
        };
        MyInterface myInterface1 = (x,y) -> {
            System.out.println("Hello "+x+y);
        };
        myInterface.message(name,symbol);
        myInterface1.message(name,symbol); 

        

    }
}
