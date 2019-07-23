package D113SetAndGet;

public class Item {

    private String name;
    private double price;
    private int amount;


    //конструктор
    public Item(String name, double price, int amount) {
        this.name = new String(name);
        this.price = price;
        setAmount(amount);
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }



    //продажа товара -1
    public void sellItem() {
        sellItem(1);
    }

    public void sellItem(int value) {
        amount -= value;
    }

    //стоимость товара цена*колличество (price*amount)
    public double purchaseAmount() {
        return price * amount;
    }

    public String toString() {
        return name + ":" + price + ":" + amount;
    }

    /*public String getName (String name) {
        this.name = name;
        return this.name;
    }
    */


}
