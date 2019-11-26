package LabWork2103.MyShapes;

import LabWork276_2710.MyShapes.Circle;
import LabWork276_2710.MyShapes.Rectangle;
import LabWork276_2710.MyShapes.Shape;
import LabWork276_2710.MyShapes.Tringle;

import static LabWork2103.MyShapes.Shape.parseShape;

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

//?????????????
//        5. Добавьте код для расчета общей площади всех типов фигур.
//                Определите локальную переменную sumArea (double типа) и
//                используйте ее в цикле для суммирования общей площади для всех фигур.
//        6 Добавьте код для суммирования общей площади для каждого типа фигуры.
//        Определите sumRectArea, sum TriangleArea, sumCircleArea (типа double) и
//        используйте его в цикле для суммирования общей площади для каждого типа фигуры.
//                Вы должны использовать ключевое слово instanceof для определения общей
//                площади для каждого из типов фигур (Rectangle, Circle, Triangle) и
//                распечатать ее на консоли. Задача 7.
//        Выполнить программу, результат должен выглядеть следующим образом:
//        Общая площадь прямоугольников: 234,54 Общая площадь круга: 547,231 Треугольник  общая площадь: 356,56

        System.out.println(circle instanceof Circle);
        System.out.println(rectangle instanceof Rectangle);
        System.out.println(tringle instanceof Tringle);


        // перебрать массив и вызвать метод draw???????????
        for (int i = 0; i < shapes.length; i++)
            System.out.println(shapes[i].toString());


     /*   sumArea = 0;
        for (int i = 0; i < shapes.length; i++) {
            double sum += shapes[i];
        }
        System.out.println(sumArea);*/

        LabWork2103.MyShapes.Shape.parseShape();

    }
}



