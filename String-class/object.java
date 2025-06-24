// Define a class
class Student {
    String name;
    int age;

    // Method to display info
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Main class
public class object {
    public static void main(String[] args) {
        // Create object of Student class
        Student s1 = new Student();   // ← Object created here
        s1.name = "Kiran raju ";
        s1.age = 27;

        // Call method using object
        s1.display();
    }
}
