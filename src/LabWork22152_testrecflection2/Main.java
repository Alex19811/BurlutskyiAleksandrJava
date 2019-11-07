package LabWork22152_testrecflection2;





import LabWork22151_testrecflection1.MyClass;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.TypeVariable;

public class Main {
    public static void main(String[] args) {

        class MyClass {
            String myStr = "abcd";
           private char value[];

            public MyClass(String myStr) {
                this.myStr = myStr;
            }

            public MyClass() {

            }

            public void getDeclaredField(String a) {
            }

            public String getMyStr() {
                return myStr;
            }
        }

        Class <MyClass> myClass= MyClass.class;
        try {
            MyClass object = new MyClass();
            Field field = myClass.getDeclaredField("myStr");
            field.setAccessible(true);
            System.out.println("Old string value: " + field.getInt(object));
            field.setInt(object, Integer.parseInt("z,x,c,v"));
            System.out.println("New string value: " + field.getInt(object));
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        System.out.println("Public fields: ");
        Field[] fields = myClass.getFields();
        for (Field field : fields) {
            Class<?> fieldsType = field.getType();
            System.out.println("\tName: " + field.getName());
            System.out.println("\tType: " + fieldsType.getName());
        }

        System.out.println("All fields: ");
        fields = myClass.getDeclaredFields();
        for (Field fieldAll : fields) {
            Class<?> fieldsTypeAll = fieldAll.getType();
            System.out.println("\tName: " + fieldAll.getName());
            System.out.println("\tType: " + fieldsTypeAll.getName());
        }

    }

}
