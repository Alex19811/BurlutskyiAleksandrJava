package AAA_Reflections;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/*class A {
    public  A(String name){
        this.name=name;
    }
    public String name;
}*/
/*class A{}
class B extends A{}
class C extends B{}*/
/*nterface R{}
interface Sw{}
class A implements R{}
class B extends A{}
class C extends B implements Sw{}*/

class A {
    public A(int i) {
        this.i = i;

    }

    int i;

}

class Test {

    public static void main(String[] args) {
        A a = new A(5);
        Class c = a.getClass();
        Field[] publicF = c.getFields();
        for (Field field : publicF) {
            Class fildType = field.getType();

            System.out.println("N" + field.getName());
            System.out.println("T" + fildType.getName());
        }
    }
}


     /*
            IllegalAccessException, NoSuchFieldException
            {A a= new A("B");

                Class c = args.getClass();
                Field nameFild = c.getField("n");
                nameFild.set(a,"New name");
                System.out.println(a.name);
*/





