import java.util.*;

public class AL3 {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("A", "B", "A", "C");

        Set<String> set = new HashSet<>(list);

        System.out.println(set); 
    }
}
