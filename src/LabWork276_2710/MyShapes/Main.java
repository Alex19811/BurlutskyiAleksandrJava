package LabWork276_2710.MyShapes;

public class Main {
    public static void main(String[] args) {
        double sumArea;
        double sumRectArea;
        double sumTriangleArea;
        double sumCircleArea;

        Shape shape = new Shape("RED");
        shape.toString();
        shape.calcArea();

        Circle circle = new Circle("GREEN", 10);
        System.out.println(circle.toString());
        circle.calcArea();
        System.out.println("Shape area is: " + circle.calcArea());

        Rectangle rectangle = new Rectangle("RED", 11, 22);
        System.out.println(rectangle.toString());
        rectangle.calcArea();
        System.out.println("Shape area is: " + rectangle.calcArea());

        Tringle tringle = new Tringle("BLACK", 5, 5, 5);
        System.out.println(tringle.toString());
        tringle.calcArea();
        System.out.println("Shape area is: " + tringle.calcArea());


        Shape[] shapes = new Shape[9];
        shapes[0] = new Rectangle("RED", 11, 22);
        shapes[1] = new Rectangle("RED", 11, 22);
        shapes[2] = new Rectangle("RED", 11, 22);
        shapes[3] = new Rectangle("RED", 11, 22);
        shapes[4] = new Rectangle("RED", 11, 22);
        shapes[5] = new Circle("GREEN", 10);
        shapes[6] = new Circle("GREEN", 10);
        shapes[7] = new Tringle("BLACK", 5, 5, 5);
        shapes[8] = new Tringle("BLACK", 5, 5, 5);

        for (int i = 0; i < shapes.length; i++)
            System.out.println(shapes[i].toString());
       


        for (int i = 0; i < shapes.length; i++) {
            System.out.println(shapes.getArea());
            shape.calcArea();
            System.out.println(shapes.sumArea());
        }




        System.out.println(circle instanceof Circle);
        System.out.println(rectangle instanceof Rectangle);
        System.out.println(tringle instanceof Tringle);

     /*   sumArea = 0;
        for (int i = 0; i < shapes.length; i++) {
            double sum += shapes[i];
        }
        System.out.println(sumArea);*/
    }
}



