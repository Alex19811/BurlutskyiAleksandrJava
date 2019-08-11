package LabWork2103.MyShapes;

import LabWork276_2710.MyShapes.Shape;

public class Circle extends Shape {

    private double radius;
    private static final double PI = 3.14159265;
    double area;


    public Circle(String shapeColor, double radius) {
        super(shapeColor);
        this.radius = radius;
    }

//    public void setRadius(double radius) {
//        this.radius = 10;

    //    }
    @Override
    public double calcArea() {
        return area = PI * (radius * radius);
        //або
        //return Math.PI * (radius * radius);
    }


    @Override
    public String toString() {
        return "This is Circle, color: " +
                getShapeColor() + ", " +
                "radius=" + radius + ", " +
                "area is: " + calcArea();
    }


    public double getRadius() {
        return radius;
    }
}

