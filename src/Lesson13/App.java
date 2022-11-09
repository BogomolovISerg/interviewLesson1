package Lesson13;

public class App {
    public static void main(String[] args){
        Shape shape;

        Square square = new Square();

        shape = square;

        shape.setValues(30);
        System.out.printf("Площадь квадрата: %10.2f\n",square.getArea());

        Triangle triangle = new Triangle();

        shape = triangle;
        shape.setValues(34,3);

        System.out.printf("Площадь треугольника: %10.2f\n",triangle.getArea());

        Circle circle = new Circle();
        shape = circle;
        shape.setValues(10);
        System.out.printf("Площадь круга: %10.2f\n",circle.getArea());
    }
}
