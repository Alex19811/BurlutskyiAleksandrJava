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



        //shape1 - масив усіх фігуз з яких вибираємо потрібний вид : Circle, Rectangle, Throwable
        for (Shape shape1:shapes) {
            sumArea+=shape1.calcArea();

            if(shape1 instanceof Rectangle){
                sumRectArea+=shape1.calcArea();
            }
            if(shape1 instanceof Circle){
                sumCircleArea+=shape1.calcArea();
            }
            if(shape1 instanceof Tringle){
                sumTriangleArea+=shape1.calcArea();
            }

        }

        System.out.println( sumArea);
        //або
        System.out.println(sumCircleArea + sumRectArea + sumTriangleArea);
        System.out.println(" 2 " + sumRectArea);
        System.out.println(" 3 " + sumCircleArea);
        System.out.println(" 4 " + sumTriangleArea);



    }
}



