package LabWork291.TestStrings1;

public class Main {
    public static void main(String[] args) {
        String myStr = "abracadabra";
        //Найдите индекс первой подстроки ra в значении myStr и выведите результат на консоль.
        int i1 = myStr.indexOf("ra");
        System.out.println(i1);
        //Найдите индекс последней подстроки "ra" значения myStr и выведите результат в консоль.
        int i2 = myStr.lastIndexOf("ra");
        System.out.println(i2);
        //Получить подстроку myStr с 3 по 7 символьным индексом и вывести результат на консоль.
        String subMyStr = myStr.substring(3, 11);
        System.out.println(subMyStr);

        //Создайте статический метод reverse String (String), который возвращает значение String
        // как результат с измененным порядком букв (измените его, например, «abcd» dcba).
        // Вызовите метод reverse String () с помощью myStrargument и выведите результат на консоль.


reverseString();

    }

    public  static String reverseString () {
        StringBuffer buffer = new StringBuffer("abcd");
        buffer.reverse();
        System.out.println(buffer);
        return new String();
    }

    // или
    /*String string = "abcd";
    String reverse = new StringBuffer(string).reverse().toString();
        System.out.println("\nString before reverse: " + string);
        System.out.println("String after reverse: " + reverse);*/
}


