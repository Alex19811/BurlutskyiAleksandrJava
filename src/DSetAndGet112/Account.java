package DSetAndGet112;

public class Account {
    private double amount;
    private final double defaultAmount = 100;

//РЕФАКТОРИНГ
    public Account() {
        //this.amount = 100;
        setAmount();
    }

    public Account(double amount) {
        //this.amount = amount;
        setAmount(amount);
    }

    //инициализация переменной в одном месте
    public void setAmount(double amount) {
       if (amount >0)
        this.amount = amount;

       // або
        /*if (amount <0)
           System.out.println();
           else
               amount = amount;
       */

    }

    public void setAmount() {
        //amount = 100;
       // setAmount(100);
        setAmount(defaultAmount);
    }

    public double getAmount() {
        return amount;
    }
}
