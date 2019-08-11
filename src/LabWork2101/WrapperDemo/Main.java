package LabWork2101.WrapperDemo;

public class Main {

    public static void main(String[] args) {
        Integer x1 = 127;
        Integer x2 = new Integer(127);
        Integer x4 = Integer.valueOf(127);
        Integer x5 = Integer.parseInt("127");
        //оператор == сверяет ссылки
        System.out.println(x1 == x2);
        //Класс Stringю. У него есть переопределенный метод equals().
        // И сравнивает он не ссылки, а именно последовательность символов в строках.
        // И если текст в строках одинаковый, неважно, как они были созданы
        // и где хранятся: в пуле строк, или в отдельной области памяти.
        // Результатом сравнения будет true.
        System.out.println(x4.equals(x5));

        Integer x6 = 129;
        Integer x7 = new Integer(129);
        Integer x8 = Integer.valueOf(129);
        Integer x9 = Integer.parseInt("129");
        System.out.println(x6 == x7);
        System.out.println(x8.equals(x9));

    }
}
