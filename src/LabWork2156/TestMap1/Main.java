package LabWork2156.TestMap1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MyTranslator myTranslator = new MyTranslator();
        myTranslator.addNewWord("Cat", "Кот");

        System.out.println(myTranslator);
       // myTranslator.translate("Cat");


       /* System.out.print("Введіть будь-яке ціле число від 1 до 10: ");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        System.out.println ("Ви ввели число " + number);*/
    }
}
