package LabWork241_243;

import java.util.Arrays;
import java.util.Scanner;

public class MyMath {

    final static double PI = 3.14;

    public static void findMin(int[] list) {
        Arrays.sort(list);
        int min = list[0];
        System.out.println("Min is " + min);

       /* int min = list[0];
        for (int i = 0; i < list.length; i++) {
            if (min > list[i])
                min = list[i];
            System.out.println("Min is " + min);
        }*/
    }

    public static void findMax(int[] list) {
        int max = list[list.length - 1];
        System.out.println("Min is " + max);
            /*int max = list[0];
            for (int i = 0; i != list.length; i++) {
                if (list[i] > max) {
                    max = list[i];
                    System.out.println("Max is " + max);*/
    }

    public static void areaOfCircle() {
        Scanner sc = new Scanner(System.in);
        {
            System.out.print("Введите радиус: ");
      /* Мы сохраняем введенный радиус в double
         потому что пользователь может ввести радиус дробным числом
       */
            double radius = sc.nextDouble();
            //Площадь круга вычисляется по формуле = PI*radius*radius
            double area = PI * (radius * radius);
            System.out.println("Площадь круга равна: " + area);
            //Длины окружности вычисляется по формуле = 2*PI*radius
            double circumference = PI * 2 * radius;
            System.out.println("Длина окружности равна: " + circumference);
        }
    }
}



