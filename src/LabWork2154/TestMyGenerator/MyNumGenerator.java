package LabWork2154.TestMyGenerator;

import java.util.*;

public class MyNumGenerator {
    int numOfElm;
    int maxNumb;

    public MyNumGenerator(int numOfElm, int maxNumb) {
        this.numOfElm = numOfElm;
        this.maxNumb = maxNumb;
    }

    ArrayList generate() {
        //заполнить коллекцию

        for (int i = numOfElm; i <= maxNumb; i++) {
            System.out.println(i);
        }
        return new ArrayList();
    }

    void generateDistinct() {
        for (int i = numOfElm; i <= maxNumb; i++) {
            maxNumb = (int) (Math.random() * 64);
            System.out.println(i);
        }

        /*// Создать новый экземпляр класса
        Random. Random random = new Random () ;
        // Генерирует случайное целое число
        int myInt = ((Random) random).nextInt () ;
        System.out.println(myInt ) ; // Генерирует случайное значение Double double myDouble = random.nextDouble () ; Система . out .println ( myDouble ) ; // Генерирует случайное число с плавающей точкой myFloat = random.nextFloat

*/

    }
}
