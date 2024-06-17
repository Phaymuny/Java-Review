package Collection;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ReviewStream {

    // stream can be create by collections, arrays, or I/O
    public static void main(String[] args) {

        /* Intermidate operations: */

        // filtering using stream:
        List<String> names = Arrays.asList("Alice", "Charlie", "David", "Bob");
        List<String> nameStartWithA = names.stream().filter(
                name -> name.startsWith("A")).collect(Collectors.toList());
        System.out.println(names.toString());
        System.out.println(nameStartWithA);

        // map:
        List<Integer> nameLength = names.stream().map(String::length).collect(Collectors.toList());
        System.out.println(nameLength);

        // sorted:
        List<String> sortedName = names.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedName);

        /* Terminal operations */
        // foreach loop
        names.stream().forEach(System.out::println);

        // Collect
        List<String> filterNames = names.stream().filter(name -> name.startsWith("C")).collect(Collectors.toList());
        System.out.println(filterNames);

        // reduce: Reduces the elements to a single value using an associative
        // accumulation function
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        int sum = numbers.stream().reduce(0, Integer::sum);
        System.out.println(sum);

        // paralle stream
        int sum1 = numbers.parallelStream().reduce(0, Integer::sum);
        System.out.println(sum1);

    }
}
