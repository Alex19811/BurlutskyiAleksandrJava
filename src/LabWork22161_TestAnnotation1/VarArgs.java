package LabWork22161_TestAnnotation1;

import java.util.Arrays;

public class VarArgs {

    @SafeVarargs
    static void findMax(int... array) {

            System.out.println("Количество аргументов: " + array.length);

            for (int a : array) {
                System.out.print(a + " ");

                int min = Arrays.stream(array).min().getAsInt();
                int max = Arrays.stream(array).max().getAsInt();
              System.out.println("Min = " + min);
                System.out.println("Max = " + max);
            }
           }


        public static void main(String[] args) {
            findMax();
            findMax(1);
            findMax(1, 2);
            findMax(new int[]{1, 3});
        }
    }

