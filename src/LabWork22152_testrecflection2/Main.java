package LabWork22152_testrecflection2;





import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) {

        class MyClass {
            String myStr = "abcd";
           private char value[];

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
    }

}
