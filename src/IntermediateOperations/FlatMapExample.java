package IntermediateOperations;

import java.util.Arrays;
import java.util.List;

public class FlatMapExample {
    public static void main(String[] args) {
        List<List<String>> listofList = Arrays.asList(
                Arrays.asList("m" , "a"),
                Arrays.asList("y" , "a"),
                Arrays.asList("n" , "k")
        );

        listofList.stream()
                .flatMap(list->list.stream())
                .map(c->c.toUpperCase())
                .forEach(System.out::println);
    }
}
