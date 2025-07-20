import java.util.TreeSet;

public class practice4 {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();
        set.add(30);
        set.add(10);
        set.add(20);
        set.add(40);
        set.add(10);
        System.out.println(set);
        System.out.println(set.first());
        System.out.println(set.last());
        set.remove(20);
        System.out.println(set);
        System.out.println("Iterating TreeSet:");
        for (Integer num : set) {
            System.out.println(num);
        }
    }
}
