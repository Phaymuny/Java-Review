package Generics;
import java.util.ArrayList;
import java.util.HashMap;

public class OtherMain {
    public static void main(String[] args) {
        //generics classes is

        //normall class need to create seperate to work with different data type varibles.
        MyInterger myInt = new MyInterger(4);
        MyDouble mydDouble = new MyDouble(4.5);

        //generics need to create only one generics class that support all type of varibles.
        Mygenrics<Integer,Integer> mygenrics = new Mygenrics<>(4,9);
        Mygenrics<Double,Double> mygenrics1 = new Mygenrics<>(4.5,5.5);

        //here if Thing in Mygenrics class add extends Number only that mean other type of varible will not work.
        Mygenrics<Character,Character>mygenrics2 = new Mygenrics<>('A','B');
        Mygenrics<String,Character>mygenrics3 = new Mygenrics<>("Call",'R');

        //ArrayList and HashMap also use generics type.
        HashMap<Integer, String> myFriend = new HashMap<>();
        //ArrayList<Things> my

        System.out.println(myInt.getValue());
        System.out.println(mydDouble.getdouble());
        System.out.println("---------------------");
        System.out.println(mygenrics.getX());
        System.out.println(mygenrics1.getX());
        System.out.println(mygenrics2.getX());
        System.out.println(mygenrics3.getX());
        //bounced
    }
}
