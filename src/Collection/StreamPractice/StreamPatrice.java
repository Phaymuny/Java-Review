package Collection.StreamPractice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class StreamPatrice {
    public static void main(String[] args) {
        // filter out even number using stream:
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10);
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
                .map(String::toUpperCase).toList();
        System.out.println("Filtered and uppercase names: " + strWithA);

        //calculate all even number :
        System.out.println("All number : "+numbers);
        int evenSum = numbers.stream().filter(num->num%2==0)
                .reduce(0,Integer::sum);
        System.out.println("sum of even: "+evenSum);

        //sum all and multiply
        int averageNum = numbers.stream().reduce(0,Integer::max);
        System.out.println(averageNum);
        int multiply = numbers.stream().reduce(1, (a, b) -> a * b);
        System.out.println(multiply);
        //
        List<String> strings = Arrays.asList("a", "b", "c", "d", "e");
        String concatenated = strings.stream().reduce("", (partialString, element) -> partialString + element);
        String concatenated1 = strings.stream().reduce("", (s1, s2) -> s1 + s2);
        System.out.println(concatenated);
        System.out.println(concatenated1);

        //remove duplicate value using stream
        //using district to remove duplicate value (make sure your arrayList is sorted too).

        System.out.println("before removed : "+ numbers);
        List<Integer> removedDuplicated = numbers.stream().sorted().distinct().toList();
        System.out.println("removed duplicated: "+removedDuplicated);

        //Write a Java program to count the number of strings in a list that start with a specific letter using streams.
        List <String> colors = Arrays.asList("Red", "Green", "Blue", "Pink", "Brown");
        String startAt = "B";
        int countString = colors.stream().filter(name->name.startsWith(startAt))
                .mapToInt(String::length).sum();
        System.out.println("couted string of Blue : "+countString);

        //Write a Java program to sort a list of strings in alphabetical order, ascending and descending using streams.
        List<String> sortedColors = colors.stream().sorted(Comparator.naturalOrder()).toList();
        System.out.println("ascending : "+sortedColors);
        List<String> decSorted = colors.stream().sorted(Comparator.reverseOrder()).toList();
        System.out.println("descending : "+decSorted);

        //Write a Java program to find the second smallest and largest elements in a list of integers using streams.
        Optional<Integer> number = numbers.stream().distinct().sorted(Comparator.reverseOrder())
                .skip(1).findFirst();
        System.out.println("second largest number"+number);
    }
}
