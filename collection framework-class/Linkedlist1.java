import java.util.LinkedList;

public class Linkedlist1 {
    public static void main(String[] args) {
        LinkedList<String> fruits = new LinkedList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        System.out.println("Initial LinkedList: " + fruits);
        fruits.add(1, "Orange");  
        System.out.println(fruits);
        System.out.println(fruits.get(2)); 
        fruits.set(2, "Mango");
        System.out.println(fruits);
        fruits.remove("Apple");
        System.out.println(fruits);
        fruits.remove(0);  
        System.out.println(fruits);
        fruits.addFirst("Kiwi");
        fruits.addLast("Grapes");
        System.out.println(fruits);
        System.out.println(fruits.contains("cherry"));
        System.out.println();
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
        System.out.println(fruits.size());
    }
}