package labs1_6;

import java.util.Objects;

public class Child extends Parent implements Cloneable {
    int childAge;
    String childName;

    @Override
    public void printName() {
        System.out.println("Child");
    }

    public void anotherMethod() {
        System.out.println("another method");
    }


    //    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof Child)) return false;
//        if (!s ) return false;
//        Child child = (Child) o;
//        return childAge == child.childAge &&
//                Objects.equals(childName, child.childName);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(super.hashCode(), childAge, childName);
//    }
}
