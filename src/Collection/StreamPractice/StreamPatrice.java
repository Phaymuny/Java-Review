package Collection.StreamPractice;

import java.util.Arrays;
import java.util.List;

public class StreamPatrice {
    public static void main(String[] args) {
        // filter out even number using stream:
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> evenNumber = numbers.stream().filter(num -> num % 2 == 0)
                .toList();
        System.out.println("even Number : " + evenNumber);

        // Mapping
        // Given a list of strings, convert each string to uppercase and collect them
        // into a new list.
        List<String> words = Arrays.asList("apple", "banana", "cherry", "date");
        List<String> uppWord = words.stream().map(name -> name.toUpperCase()).toList();
        System.out.println("All upperCase word : " + uppWord);

        // Sorting
        // Given a list of names, sort them in alphabetical order and collect them into
        // a new list.
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");
        List<String> allName = names.stream().sorted().toList();
        System.out.println("sorted Name : " + allName);

        // Reducing
        // Given a list of integers, calculate the sum of all elements using the reduce
        // method.
        int sum = numbers.stream().reduce(0, Integer::sum);
        System.out.println("Sum all elements in this arrayList : " + sum);

        // Combining Operations
        // Given a list of strings, filter out strings that start with "A", convert them
        // to uppercase, and collect them into a new list
        List<String> strWithA = names.stream().filter(name -> name.startsWith("A"))
                .map(name->name.toUpperCase()).toList();
        System.out.println("Filtered and uppercase names: " + strWithA);

    }
}
