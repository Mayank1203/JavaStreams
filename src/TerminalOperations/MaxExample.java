package TerminalOperations;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class MaxExample {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        final Optional<Integer> maxValue = list.stream()
                .max(Comparator.naturalOrder());
        System.out.println(maxValue.get());
    }
}
