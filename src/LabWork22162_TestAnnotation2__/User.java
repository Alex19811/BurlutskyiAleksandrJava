package LabWork22162_TestAnnotation2__;

import java.lang.reflect.Type;
import java.util.List;

public class User {
    enum PermissionAction {USER_READ, USER_CHANGE}

    String name;
    List<PermissionAction> permissions;

    public User(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return super.toString();
    }


    public List<PermissionAction> getPermissions() {
        return permissions;
    }

    public static void main(String[] args) {

        PermissionAction permissionActions [] = PermissionAction.values();
        for (PermissionAction s : permissionActions) {
            System.out.println(s);
        }
    PermissionAction a;
        a=PermissionAction.valueOf("USER_CHANGE");
        System.out.println("Переменная а содержит: " + a);

    }

}


