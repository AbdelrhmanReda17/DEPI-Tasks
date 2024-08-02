package P5;
// OPEN CLOSE PRINCIPLE
public interface  Shape {
    void draw();
}
class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing Circle");
    }
}
class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing Rectangle");
    }
}

class Main {
    public static void main(String[] args) {
        Shape circle = new Circle();
        circle.draw();
        Shape rectangle = new Rectangle();
        rectangle.draw();
    }
}

