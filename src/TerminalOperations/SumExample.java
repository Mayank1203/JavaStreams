package TerminalOperations;

import java.util.Arrays;
import java.util.List;

public class SumExample {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);

        int sumOfNumber = list.stream()
                .mapToInt(x -> x.intValue())
                .sum();
        System.out.println(sumOfNumber);

    }
}
