import java.util.*;

public class practice7 {
    public static void main(String[] args) {
        Set<String> fruits = new HashSet<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Apple");  

        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
