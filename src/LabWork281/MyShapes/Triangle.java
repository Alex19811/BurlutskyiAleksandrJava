package LabWork281.MyShapes;

public class Triangle  extends Shape{
    private double a;
    private double b;
    private double c;
    double area;

    public Triangle (String shapeColor, double a, double b, double c) {
       super(shapeColor);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double calcArea() {
        double p = (a + b + c) / 2;
        return area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }


    @Override
    public String toString() {
        return "This is Triangle, color: " +
                getShapeColor() + ", " +
                "a=" + a + ", " +
                "b=" + b + ", " +
                "c=" + c + ", " +
                "area is: " + calcArea();
    }

   public String getShapeColor() {
        return getShapeColor();

    }

}
