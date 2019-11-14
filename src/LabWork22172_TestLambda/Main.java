package LabWork22172_TestLambda;

import java.util.*;
import java.util.function.Predicate;

public class Main {
        public static void main(String[] args) {

        Integer[] array = new Integer[15];
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int) (Math.random() * 16));
            System.out.println(array[i]);
        }

        Arrays.sort(array,
                (a, b) -> {
                    return Integer.signum(b - a);
                }
        );
        System.out.println("Отсортированный массив в порядке убывания: " + Arrays.toString(array));

        Arrays.sort(array,
                (a, b) -> {
                    return Integer.signum(a - b);
                }
        );
        System.out.println("Отсортированный массив в порядке возрастания: " + Arrays.toString(array));

        ArrayList <String> strings = new ArrayList<String>();
        strings.add("A1");
        strings.add("A2");
        strings.add("A3");
        strings.add("A4");
        strings.add("A5");

        strings.sort(Collections.reverseOrder());
        System.out.println("Сортировка строк в обратном порядке: " + strings);


        Collections.sort(strings, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s1.length() - s2.length();
            }
        });
        Collections.sort(strings, (s1, s2) -> s1.length() - s2.length());
        System.out.println("Сортировка строк в обратном порядке через лямда-виражение: " + strings);




            Predicate<Integer> negative = i -> i < 0;
            System.out.println(negative.test(-6));



            Predicate<String> containsA = t -> t.contains("A1");
            Predicate<String> containsB = t -> t.contains("A2");
            System.out.println(containsA.and(containsB).test("A1A2"));


            Predicate<String> pred = s -> s.isEmpty();
            System.out.println(pred.test("A1"));

            /*public static void suEven(Integer[] array, Predicate<Integer> predicate){
                System.out.println("Inside Predicate");
            }



                List<Integer> lst = new ArrayList<Integer>();

                method1(i -> true);

                method1(s -> lst.add(s)); //ambiguous error
            }
        }
            Arrays.sort(array,
                    (a, b) -> {
                        return Integer.signum(b - a);
*/


        /*public static void sumEven(Integer[] array, Predicate<Integer> predicate) {
            for(Integer n: array)  {
                if(predicate.test(n)) {
                    System.out.print(n + " ");
                }
            }
            System.out.println();
        }

        public static void printJStr(ArrayList <String> strings, Predicate<String> predicate) {
            for(String n: strings)  {
                if(predicate.test(n)) {
                    System.out.print(n + " ");
                }
            }
            System.out.println();
        }
*/


       List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);

        System.out.print("Выводит все числа: ");
        evaluate(list, (n)->true);

        System.out.print("Не выводит ни одного числа: ");
        evaluate(list, (n)->false);

        System.out.print("Вывод четных чисел: ");
        evaluate(list, (n)-> n%2 == 0 );

        System.out.print("Вывод нечетных чисел: ");
        evaluate(list, (n)-> n%2 == 1 );

        System.out.print("Вывод чисел больше 5: ");
        evaluate(list, (n)-> n > 5 );

    }

    public static void evaluate(List<Integer> list, Predicate<Integer> predicate) {
        for(Integer n: list)  {
            if(predicate.test(n)) {
                System.out.print(n + " ");
            }
        }
        System.out.println();
    }

}



