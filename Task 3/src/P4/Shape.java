package P4;
// LISKOV SUBSTITUTION PRINCIPLE
public interface Shape {
    public double getArea();
}
class Rectangle implements Shape {
    private double height;
    private double width;

    @Override
    public double getArea() {
        return height * width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}

class Square implements Shape {
    private double side;

    @Override
    public double getArea() {
        return side * side;
    }

    public void setSide(double side) {
        this.side = side;
    }
}

class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.setHeight(5);
        rectangle.setWidth(10);
        System.out.println("Rectangle area: " + rectangle.getArea());
        Square square = new Square();
        square.setSide(5);
        System.out.println("Square area: " + square.getArea());
    }
}
