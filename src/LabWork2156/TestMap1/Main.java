package LabWork2156.TestMap1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MyTranslator myTranslator = new MyTranslator();
        myTranslator.addNewWord("Cat", "Кот");
        myTranslator.addNewWord("Mouse", "Мышь");

        myTranslator.translate("Cat");
        myTranslator.translate("Mouse");

        System.out.print("Введите слово: ");
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();
        System.out.println("Ви ввели слово " + word);
        myTranslator.translate(word);


    }
}
