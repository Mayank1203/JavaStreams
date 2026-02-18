package IntermediateOperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PeekExample {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

        List<Integer> integerList = list.stream()
                .map(i -> i * i)
                .peek(System.out::println)
                .collect(Collectors.toList());
    }
}
