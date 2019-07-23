package D141Inheritance;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("SergD", 15, 3);
        Person teacher1 = new Person() {
            @Override
            public int getSallary() {
                return 0;

            } 

            @Override
            public int getSallary(int exchengeRate) {
                return 0;
            }
        };
// ; - закрытие оператора new

        ArrayList<Person> school = new ArrayList<>();
        school.add(teacher);
        school.add(teacher1);

        for (Person person : school)

            System.out.println(person.toString() + " -> " + person.getSallary());

    }


}
