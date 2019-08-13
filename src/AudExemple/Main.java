package AudExemple;

import intertest.UserService;
import intertest.handler.IDataHandler;
import intertest.handler.impl.DBHandlerImpl;
import intertest.handler.impl.FileHandlerImpl;
import labs1_6.Parent;

import java.util.Scanner;

public class Main extends Parent {

    public static void main(String[] args) {
        System.out.println("Please input data storage:");
        System.out.println("1. DB");
        System.out.println("2. File");

        Scanner sc = new Scanner(System.in);
        int userChoise = sc.nextInt();

        IDataHandler handler = null;
        if(userChoise == 1) {
            handler = new DBHandlerImpl();
        } else if(userChoise == 2) {
            handler = new FileHandlerImpl();
        }
        UserService userService = new UserService(handler);
        userService.updateUser(25L, "Gregory", 38);
    }
}
