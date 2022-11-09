package Lesson13;

public class Shape {
    private double height;
    private double width;

    public void setValues(double height, double width){
        this.height = height;
        this.width = width;
    }
    public void setValues(double height){
        this.height = height;
        this.width = 0;
    }

    public double getHeight(){
        return height;
    }

    public double getWidth(){
        return width;
    }
}
