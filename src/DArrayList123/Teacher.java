package DArrayList123;

public class Teacher {
    private String name;
    private double rate = 6;
    private int[] m = new int[4];

    static {
        System.out.println("Ststic block!!!");
    }

    {
        System.out.println("Non-ststic block!!!");

    }

    public Teacher() {
        System.out.println("Constructor!!!");
        ;
    }

    public Teacher(String name, double rate) {
        this.name = name;
        this.rate = rate;
    }

    public Teacher(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public String getName() {
        return name;
    }

    public double getRate() {
        return rate;
    }
}
