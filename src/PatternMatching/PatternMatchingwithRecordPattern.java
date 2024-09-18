package PatternMatching;

public class PatternMatchingwithRecordPattern {
    interface Shape {
    }

    record Circle(double radius) implements Shape {
    }

    record Square(double side) implements Shape {
    }

    record Rectangle(double length, double width) implements Shape {
    }

    public static void main(String[] args) {

        //Shape shape = new Circle(10);
        //Shape square = new Square(10);
        Shape shape=null;

        switch (shape) {
            //case null -> System.out.println("No Object defined");
            case Circle(double radius) ->
                System.out.println("The shape is Circle with area: " + Math.PI * radius * radius);
            case Square(double side) ->
                System.out.println("The shape is Square with area: " + side * side);
            case Rectangle(double length, double width)  ->
                System.out.println("The shape is Rectangle with area: + " + length * width);

            case null , default ->
                System.out.println("Unknown Shape");

        }
    }
}
