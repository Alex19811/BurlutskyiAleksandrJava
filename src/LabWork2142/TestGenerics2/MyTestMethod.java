package LabWork2142.TestGenerics2;

public class MyTestMethod<I> {

    public MyTestMethod() {
    }

    public <T> T calcNum(T[] array, T maxElem) {
        T[] array;
        T maxElem = 2;
        T maxElem1 = array.length - maxElem;

        T sum = 0;

        for (int i = 3; i < array.length; i++) {
            sum += array[i]; // Сумма всех элементов заданного массива
            System.out.println("Длинна массива = " + maxElem1 + " элемента.");
        }
        return maxElem;
    }


    public void calcNum(double[] arr1) {
    }

    public void calcNum(Integer[] arr1) {
    }

}
