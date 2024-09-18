package PatternMatching;

public class PatternMatchingExample {
    interface Shape {}
    record Circle(double radius) implements Shape { }
    record Square(double side) implements Shape { }
    record Rectangle(double length, double width) implements Shape { }

    public static void main(String[] args) {

        Shape shape = new Circle(10);

        switch(shape) {

            case Circle c:
                System.out.println("The shape is Circle with area: " + Math.PI * c.radius() * c.radius());
                break;

            case Square s:
                System.out.println("The shape is Square with area: " + s.side() * s.side());
                break;

            case Rectangle r:
                System.out.println("The shape is Rectangle with area: + " + r.length() * r.width());
                break;

            default:
                System.out.println("Unknown Shape");
                break;
        }
    }
}
