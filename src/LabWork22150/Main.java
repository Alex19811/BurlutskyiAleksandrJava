package LabWork22150;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static java.lang.reflect.Modifier.PRIVATE;

public class Main {
    public static void main(String[] args) {
        Class userClass = Class.class;
        Field[] fields = userClass.getFields();
        System.out.println(fields.length);
        for (Field field : fields) {
            String name = field.getName();
            System.out.println(name);


 //           Modifier.PRIVATE;
            System.out.println(userClass.getSuperclass());
        }
    }
}
