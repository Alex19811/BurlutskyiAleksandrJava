package LabWork2156.TestMap1;


import java.util.HashMap;

public class MyTranslator {

    HashMap<String, String> dictionary = new HashMap<String, String>();

    String addNewWord(String en, String ru) {
        //добавление элементов
        dictionary.put("Cat", "Кот");
        dictionary.put("Mouse", "Мышь");
        //System.out.println(en + " "+ ru);
        return new String();
    }


        String translate (String en){
            System.out.println(dictionary.get(en));

            return new String();
    }
}




