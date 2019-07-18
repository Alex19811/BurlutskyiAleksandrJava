package LabWork241_243;

public class Calculation<i, max> {
    public static void main(String[] args) {

        int[] list1 = new int[]{1, 2, 3, 4, 5};
        int[] list2 = new int[]{6, 7, 8, 9, 10};


        MyMath.findMin(list1);
        MyMath.findMax(list1);
        MyMath.findMin(list2);
        MyMath.findMax(list2);

        MyMath.areaOfCircle();
        //Другой способ поиска минимального значения элемента массива
     /*   int[] numbers = {-9, 6, 0, -59};
        int min = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (min > numbers[i])
                min = numbers[i];
        }

        System.out.println(min);*/
    }
}

