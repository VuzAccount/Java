package practice4;

class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }
}

public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);

        System.out.println("Radius of the circle: " + circle.getRadius());
        System.out.println("Area of the circle: " + circle.calculateArea());
        System.out.println("Circumference of the circle: " + circle.calculateCircumference());

        circle.setRadius(7.0);
        System.out.println("New radius of the circle: " + circle.getRadius());
        System.out.println("New area of the circle: " + circle.calculateArea());
        System.out.println("New circumference of the circle: " + circle.calculateCircumference());
    }
}
