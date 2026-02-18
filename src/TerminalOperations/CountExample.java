package TerminalOperations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountExample {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);

        long TotalNumber = list.stream()
                .count();
        System.out.println(TotalNumber);

    }
}
