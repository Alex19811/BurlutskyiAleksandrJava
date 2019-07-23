package example;

import labs1_5.User;

public class Main {


    public static void main(String[] args) {

        User user = new User();
        user.name = "Gregory";
        user.age = 37;

        System.out.println(user.age + "before");

        user.add(user);

        System.out.println(user.age + "after");
    }
}
