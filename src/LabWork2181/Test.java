package LabWork2181;

import java.math.BigInteger;
import java.util.Scanner;

public class Test {


    public static void main(String[] args) {
        System.out.print("Введіть будь-яке ціле число від 10 до 50: ");
        //Оголосити сканер
        Scanner scan = new Scanner(System.in);
        //Зчитати число з консолі
        int n = scan.nextInt();
        System.out.println("Ви ввели число " + n);

        if (n < 10) {
            System.out.println("Ви ввели число < 10");
        }
            if (n >= 10) {
                if (n <= 50)
                System.out.println(calculateFactorial(n));
        }
        if (n > 50) {
            System.out.println("Ви ввели число > 50");
        }
    }

    static int calculateFactorial(int n) {

        BigInteger fact = BigInteger.valueOf(1);
        for (int i = 1; i <= n; i++)
            fact = fact.multiply(BigInteger.valueOf(i));
        {
            System.out.println(fact);
        }
        return n;
    }
    // або
     /* static int random(int z) {
        int number = 10;
        for (int i = 10; i <= z; i++) {
            i = (int) (Math.random() * 50);

            System.out.println(number);
        }
        return number;
    }*/


   /* static int calculateFactorial(int n) {

        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        return result;
    }
*/
}



