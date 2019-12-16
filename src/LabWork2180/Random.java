package LabWork2180;

public class Random {


    public Random(int i) {
    }

    public static void main(String[] args) {
// Создать новый экземпляр класса

Random rnd1 = new Random(123);
Random rnd2 = new Random(123);
Random rnd3 = new Random(124);
for (int i =0; i<10; i++){
    System.out.println("rnd1 = " + rnd1.nextInt(100)
            + ", rnd2 = " + rnd2.nextInt(100)
            + ", rnd3 = " + rnd3.nextInt(100));
}



    }

    private int nextInt(int i) {
        return i;
    }

  /*Random random = new Random(5);
        // Генерирует случайное целое число
        int myInt = random.nextInt();
        System.out.println(myInt);
        // Генерирует случайное значение
        Double myDouble = random.nextDouble(1);
        System.out.println(myDouble);
        // Генерирует случайное число с плавающей точкой
        float myFloat = random.nextFloat(6);

    }

    private float nextFloat(int i) {
    }

    private Double nextDouble() {
    }

    private int nextInt() {
    }*/

}
