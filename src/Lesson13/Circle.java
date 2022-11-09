package Lesson13;

public class Circle extends Shape{
    public double getArea(){
        return Math.PI * Math.pow(getHeight(), 2);
    }
}
