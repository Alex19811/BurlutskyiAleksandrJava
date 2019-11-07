package LabWork22151_testrecflection1;

import java.lang.reflect.*;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException {

        Class <MyClass> myClass= MyClass.class;
//        Field[] fields1 = myClass.getFields();
//        System.out.println(fields1.length);
//        Method[] mods = myClass.getMethods();
//        System.out.println(mods.length);
//        for (Field field : fields) {
//            int a = Integer.parseInt(field.getName());
//            System.out.println(a);
//
//        }
        System.out.println("Modifers: ");
        int mods = myClass.getModifiers();
        if (Modifier.isPrivate(mods))
            System.out.println("private");
        if (Modifier.isProtected(mods))
            System.out.println("protected");
        if (Modifier.isFinal(mods))
            System.out.println("final");
        if (Modifier.isPublic(mods))
            System.out.println("public");


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

        System.out.println("Constructors: ");
        Constructor<?>[] constructors = myClass.getConstructors();
        int i = 0;
        for (Constructor<?> constructor : constructors) {
            System.out.println("Constructor" + (i++) + ":");

            TypeVariable[] paramTypes = constructor.getTypeParameters();
            for (TypeVariable paramType : paramTypes) {
                System.out.println(paramType.getName() + " ");
            }
            System.out.println();
        }
        try {
            Class<?>[] paramTypes = new Class<?>[]{int.class};
            Constructor<?> constructor = myClass.getConstructor(paramTypes);
            MyClass t = (MyClass)constructor.newInstance(1);
            System.out.println("Filds: " + t.getA() + t.getB());

        } catch (Exception ex) {
            ex.printStackTrace();
        }

        System.out.println("Methods: ");
        Method[] methods = myClass.getMethods();
        for (Method method : methods) {
            System.out.println("Name" + method.getName());
            System.out.println("\tReturn type:" + method.getReturnType().getName());
            Class<?>[] paramTypes = method.getParameterTypes();
            System.out.println("\tParam types:");
            for (Class<?> paramType : paramTypes) {
                System.out.println(" " + paramType.getName());
            }
            System.out.println();
        }
        try {
            MyClass object = new MyClass();
            Class<?>[] paramTypes = new Class<?>[]{int.class};
            Method method = myClass.getMethod("SetA", paramTypes);
            Object[] arguments = new Object[]{Integer.valueOf(33)};
            method.invoke(object, arguments);
           // System.out.println("A" + object.getA());
        } catch ( Exception ex) {
            System.out.println(ex.toString());
        }


    }
}



