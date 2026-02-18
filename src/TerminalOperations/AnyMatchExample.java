package TerminalOperations;

import java.util.Arrays;
import java.util.List;

public class AnyMatchExample {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 3, 5, 7, 9);

        boolean b = list.stream()
                .anyMatch(x -> x % 2 == 0);
        System.out.println(b);
    }
}
