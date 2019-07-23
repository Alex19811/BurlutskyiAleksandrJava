package D141Inheritance;

public class Teacher extends Person {
    public int rate;
    public int time;

    public Teacher() {
    }

    public Teacher(String name, int rate, int time) {
        super(name);
        this.rate = rate;
        this.time = time;
    }

    @Override
    public int getSallary() {
        return rate * time;
    }

    @Override
    public int getSallary(int exchengeRate) {
        return getSallary() * exchengeRate;
    }

    @Override
    public String toString() {
        return super.toString() + "rate= " + rate;
    }
}




