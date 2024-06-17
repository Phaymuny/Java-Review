package Collection;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Streams {
    public static void main(String[] args) {
        //stream is api of Java 8;
        List<Integer> num = Arrays.asList(4,5,6,8,2,8);

        /* Consumer<Integer> con = new Consumer<Integer>() {
            @Override
            public void accept(Integer n) {
                System.out.println(n);
            }
        } */

       // Consumer<Integer> con = n -> System.out.println(n);
        Stream<Integer> s1 = num.stream();
       /* Predicate<Integer> p = new Predicate<Integer>() {
            @Override
            public boolean test(Integer n) {
               return n%2==0;
            }
        };*/



        //Predicate<Integer> p = (n) -> n%2==0;
        s1.filter(n -> n % 2 == 0)
                .map(w -> w * 2)
                .forEach(a -> System.out.println(a));
        //s1.filter((n)->n%2==0).map(w->w*2).forEach(a->System.out.println(a));  
        //s1.filter((n) -> n%2==0).map(w->w*2).forEach(a->System.out.println(a));
        //Stream<Integer> s3 = s2.map(n->n*2);

        //s1.forEach(n-> System.out.println(n));
        //s2.forEach(n-> System.out.println(n));
        //s3.forEach(n-> System.out.println(n));
        //Steam you can use it only once\
        //s1.forEach(n-> System.out.println(n));
        //num.forEach(n -> System.out.println(n));

    }
}
