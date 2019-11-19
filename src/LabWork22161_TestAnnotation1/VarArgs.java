package LabWork22161_TestAnnotation1;

import javafx.scene.input.KeyCode;

import java.util.Arrays;

import static javafx.scene.input.KeyCode.T;

public class VarArgs {

    @Deprecated
    static void findMax(int... varargs) {

            System.out.println("Количество аргументов: " + varargs.length);

            for (int a : varargs) {
                System.out.print(a + " ");

                int min = Arrays.stream(varargs).min().getAsInt();
                int max = Arrays.stream(varargs).max().getAsInt();
              System.out.println("Min = " + min);
                System.out.println("Max = " + max);
            }
           }

    @SuppressWarnings("deprecation")
        public static <T> void main(String[] args) {
            findMax();
            findMax(1);
            findMax(1, 2);
            findMax(new int[]{1, 3});

      /*  T[] args;
        static  <T> T[] findMax1(T[] args){
            System.out.println("Количество аргументов: " + args.length);
            for (T a : args) {
                System.out.print(a + " ");
            }
            System.out.println();
        }*/

        }

    private static void findMax1(KeyCode t) {
    }

}


