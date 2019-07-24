package LabWork276.MyShapes;

public class Shape {

    //private String name;
    private String shapeColor;


    public Shape(String shapeColor) {
        this.shapeColor = shapeColor;
    }


    public double calcArea() {
        return (0.0);
    }

    public String getShapeColor() {
        return shapeColor;
    }

    @Override
    public String toString() {
        System.out.println("Shape color is : " + shapeColor);
        System.out.println("Shape area is : " + calcArea());
        return  (shapeColor);

    }
}
