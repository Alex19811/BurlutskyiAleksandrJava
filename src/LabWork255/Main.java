package LabWork255;

public class Main {
    public static void main(String[] args) {

       //Class Main, который создаст пять экземпляров класса initTest
        // и вызовет метод getId () для каждого экземпляра
        // и выведет возвращенное значение на консоль


        InitTest initTest1 = new InitTest();
        InitTest initTest2 = new InitTest();
        InitTest initTest3 = new InitTest();
        InitTest initTest4 = new InitTest();
        InitTest initTest5 = new InitTest();

        initTest1.getId();
        initTest2.getId();
        initTest3.getId();
        initTest4.getId();
        initTest5.getId();

    }
}
