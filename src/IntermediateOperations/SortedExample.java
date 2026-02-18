package IntermediateOperations;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class SortedExample {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(9, 2, 3, 7, 5);

        list.stream()
                .sorted()
                .forEach(System.out::println);

        list.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);


        List<String> list1 = Arrays.asList("apple","banana","mango");

        Stream<String> sortedList = list1.stream()
                .sorted(Comparator.comparingInt(String::length));

        sortedList.forEach(System.out::println);

        Stream<String> sortedList1 = list1.stream()
                .sorted(Comparator.comparingInt(String::length).reversed());

        sortedList1.forEach(System.out::println);



    }
}
