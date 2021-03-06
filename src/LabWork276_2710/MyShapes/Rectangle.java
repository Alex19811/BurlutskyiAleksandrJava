package LabWork276_2710.MyShapes;

public class Rectangle extends Shape {
    private double width;
    private double height;
    double area;

    public Rectangle(String shapeColor, double width, double height) {
        super(shapeColor);
        this.width = width;
        this.height = height;
    }

    @Override
    public double calcArea()    {
        double area = width * height;
        return area;
    }

    public double getArea() {
        return area;
    }

    @Override
    public String toString() {
        return "This is Rectangle, color: " +
                getShapeColor() + ", " +
                "width=" + width + ", " +
                "height=" + height+ ", " +
                "area is: " + calcArea();
    }

}
