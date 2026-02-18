package IntermediateOperations;

import java.util.Arrays;
import java.util.List;

public class MapExample {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple","banana","mango");

        list.stream()
                .map(name->name.toUpperCase())
                .forEach(System.out::println);
    }
}
