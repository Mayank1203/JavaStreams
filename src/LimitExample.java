import java.util.Arrays;
import java.util.List;

public class LimitExample {
    public static void main(String[] args) {
//        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
//
//        list1.stream()
//                .limit(3)
//                .forEach(System.out::println);

        List<String> list1 = Arrays.asList("a", "b", "c" , "d", "e");

        list1.stream()
                .limit(3)
                .forEach(System.out::println);
    }
}
