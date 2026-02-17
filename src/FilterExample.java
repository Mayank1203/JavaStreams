import java.util.Arrays;
import java.util.List;

public class FilterExample {
    public static void main(String[] args) {
       List<Integer> list = Arrays.asList(1,2,3,4,5);

       list.stream()
               .filter(a->a%2==0)
               .forEach(System.out::println);
    }
}