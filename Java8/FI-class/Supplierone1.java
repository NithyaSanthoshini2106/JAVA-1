import java.util.function.Supplier;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Consumer;

public class Supplierone1 {
    public static void main(String[] args) {

        // Supplier: returns 100
        Supplier<Integer> s1 = () -> 100;
        System.out.println(s1.get());  // Output: 100

        
    }
}
