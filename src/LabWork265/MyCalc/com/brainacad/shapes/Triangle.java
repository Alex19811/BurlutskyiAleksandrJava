package LabWork265.MyCalc.com.brainacad.shapes;

import java.awt.geom.Area;

public class Triangle {
    public double area;
    public double a = 1.0;
    public double b = 1.0;
    public double c = 1.0;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Triangle() {

    }


    // для формулы Герона (по 3м  сторонам)
   public double getArea () {
       double p1 = (a + b + c) / 2;
       area = Math.sqrt(p1 * (p1 - a) * (p1 - b) * (p1 - c));
       System.out.println(p1);
       System.out.println(area);
       return area;





        }

    }





    /*public double area() {
        double area;
        if(area == -1) {
            double ab = a.distanceTo(b);
            double bc = b.distanceTo(c);
            double ac = a.distanceTo(c);
            double p = (ab + bc + ac) / 2;
            area = Math.sqrt(p * (p-ab) * (p-bc) * (p-ac));
        }
        return area;

}
*/