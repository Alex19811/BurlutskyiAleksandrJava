package LabWork281.MyShapes;

abstract public class Shape implements Drawable {

    //private String name;
    private String shapeColor;


    public Shape(String shapeColor) {
        this.shapeColor = shapeColor;
    }

    abstract public double calcArea();


    public String getShapeColor() {
        return shapeColor;
    }

    public abstract int compareTo(Object o);

    @Override
    public String toString() {
        System.out.println("Shape color is : " + shapeColor);
        System.out.println("Shape area is : " + calcArea());
        return  (shapeColor);

    }

    @Override
    public String draw() {
        System.out.println("Shape color is : " + shapeColor);
        System.out.println("Shape area is : " + calcArea());
        return shapeColor;
    }
}
