package LabWork2181;

import java.util.Scanner;

public class Test {


        public static void main(String[] args){
            System.out.print("Введіть будь-яке ціле число від 10 до 50: ");
            //Оголосити сканер
            Scanner scan = new Scanner(System.in);
            //Зчитати число з консолі
            int number = scan.nextInt();
            System.out.println ("Ви ввели число " + number);

            System.out.println(calculateFactorial(4));
        }

    static int random(int z) {
        int number = 10;
        for (int i = 10; i <= z; i++) {
            i = (int) (Math.random() * 50);

            System.out.println(number);
        }
        return number;
    }


        static int calculateFactorial ( int n){

        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        return result;
    }




    }


