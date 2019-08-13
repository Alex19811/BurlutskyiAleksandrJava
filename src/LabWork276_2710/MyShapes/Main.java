package LabWork276_2710.MyShapes;

public class Main {
    public static void main(String[] args) {
        double sumArea = 0;
        double sumRectArea = 0;
        double sumTriangleArea = 0;
        double sumCircleArea = 0;

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


        for (int i = 0; i < shapes.length; i++){
            shape.calcArea();

        sumArea+=shapes[i].calcArea();
           }
        System.out.println(sumArea);



        for (int i = 0; i < shapes.length; i++){
            shape.calcArea();
            if(shape instanceof Rectangle){
                sumRectArea+=shapes[i].calcArea();
            }
            if(shape instanceof Circle){
                sumCircleArea+=shapes[i].calcArea();
            }
            if(shape instanceof Tringle){
                sumTriangleArea+=shapes[i].calcArea();
            }
        }
        System.out.println(sumArea);
        System.out.println(sumRectArea);
        System.out.println(sumCircleArea);
        System.out.println(sumTriangleArea);


        System.out.println(circle instanceof Circle);
        System.out.println(rectangle instanceof Rectangle);
        System.out.println(tringle instanceof Tringle);


    }
}



