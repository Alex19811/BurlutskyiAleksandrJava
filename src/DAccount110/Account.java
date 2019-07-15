package DAccount110;

public class Account {
    public String name;
    public int pin;
    public double amount;

    public void setAmount(double d) {
        if (d < 0)
            System.out.println("Wrong Data!");
        else
                amount = d;
    }
}
