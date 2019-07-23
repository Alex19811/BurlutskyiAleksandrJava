package D113SetAndGet;

public class Main  {
    public static void main(String[] args) {
      /* // Создаем магазин
        Item [] shop = new Item[100];
       shop [0] = new Item("Bread", 10.5, 40);
       shop [1] = new Item("Butter", 11.3, 12);*/


       //Продажа товара
        Item item = new Item("TV", 20.0 , 5);
        double value = item.purchaseAmount();
        System.out.println(value);
        item.sellItem();


        //продалось 3 товара, осталось 2
        item.sellItem(2);
        value = item.purchaseAmount();
        System.out.println(value);

        System.out.println(item.toString());
    }

}
