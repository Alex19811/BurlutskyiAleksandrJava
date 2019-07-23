package D141Inheritance;

abstract public class Person {
    public String name;

    public Person() {

    }

    public Person(String name) {

        this.name = name;
    }

    public void setName(String name) {

        this.name = name;
    }

    @Override
    public String toString() {
        return "name= " + name;
    }

    abstract public int getSallary();

    abstract public int getSallary(int exchengeRate);
}
