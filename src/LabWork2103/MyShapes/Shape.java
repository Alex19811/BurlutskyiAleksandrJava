package LabWork2103.MyShapes;

import LabWork281.MyShapes.Drawable;

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

    @Override
    public String toString() {
        System.out.println("Shape color is : " + shapeColor);
        System.out.println("Shape area is : " + calcArea());
        return (shapeColor);

    }

    @Override
    public String draw() {
        System.out.println("Shape color is : " + shapeColor);
        System.out.println("Shape area is : " + calcArea());
        return shapeColor;
    }

    public static String parseShape() {
        String s = "1166628";

        Integer i = Integer.parseInt(s);

        System.out.println(i);
        Double.parseDouble (s);
        return new String();
    }
}
