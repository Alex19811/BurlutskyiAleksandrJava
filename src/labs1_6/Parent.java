package labs1_6;

import java.math.BigDecimal;
import java.util.Objects;

public class Parent {

    private int age;
    private Child child;

    public void printName() {
        System.out.println("Parent");
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof Parent)) return false;
//        Parent parent = (Parent) o;
//        return age == parent.age &&
//                Objects.equals(child, parent.child) &&
//                Objects.equals(lastName, parent.lastName) &&
//                Objects.equals(money, parent.money) &&
//                Objects.equals(name, parent.name);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(age, child, lastName, money, name);
//    }
//
//    protected String lastName;
//    public BigDecimal money;
//    String name;
//
//    @Override
//    public String toString() {
//        return "Parent{" +
//                "age=" + age +
//                ", lastName='" + lastName + '\'' +
//                ", money=" + money +
//                ", name='" + name + '\'' +
//                '}';
//    }
}
