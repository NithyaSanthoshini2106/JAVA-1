abstract class Shape {
    abstract void draw(); 
}

class Circle extends Shape {
    void draw() {
        System.out.println("Drawing a circle");
    }
}

public class Testabs1 {
    public static void main(String[] args) {
        Shape s = new Circle();  
        s.draw();
    }
}
