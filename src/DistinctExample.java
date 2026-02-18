import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DistinctExample {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,4,2,8,1,2);

        list.stream()
                .distinct().
                forEach(System.out::println);
    }
}
