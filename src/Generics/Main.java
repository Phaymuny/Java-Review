package Generics;

public class Main {
    //what is generics enable type classes and interfaces to be parameters when defining classes, interface and methods
    //a benefit of it can eliminate the need to create multiple versions of methods or classes for version data types.
    //use one version for all the reference data types.


    public static <Thing> void display(Thing[] array ) {
        for (Thing x : array) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Integer[] inArray = {1,2,3,5,4,6,8};
        Double[] dobArrays = {1225.5,1214.5,253.12};
        Character[] charArray = {'A','B','C'};

        //we can call display method with different data type no need
        // to create different data type with method to use with all that.
        //this is the benefit of generics method.

        display(inArray);
        display(dobArrays);
        display(charArray);
        System.out.println(getFirst(inArray));
        System.out.println(getFirst(dobArrays));
        System.out.println(getFirst(charArray));

    }
    public static <Thing> Thing getFirst(Thing[] array){
        return array[0];
    }
}
