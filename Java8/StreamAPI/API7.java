import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class API7 {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5);

        List<Integer> evens = nums.stream()
                                  .filter(n -> n % 2 == 0)
                                  .collect(Collectors.toList());

        System.out.println(evens); 
    }
}
