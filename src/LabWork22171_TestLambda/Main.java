package LabWork22171_TestLambda;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    private static Object Predicate;

    public static void main(String[] args) {

        Integer[] array = new Integer[15];
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int) (Math.random() * 16));
            System.out.println(array[i]);
        }

       /* Arrays.sort(new Integer[][]{array}, Collections.reverseOrder());
        System.out.println("Отсортированный список: " + Arrays.toString(array));*/

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
        strings.add("B5");

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


        //Строки, которые начинаются с "А"

        List<String> namesWithA = strings.stream()
                .filter(name -> name.startsWith("A"))
                .collect(Collectors.toList());
        System.out.println("Строки, имена которых начинаются с А: " + namesWithA);









        /*private static Random random = new Random();

        private Integer[] sort(Integer[] array, Predicate<Integer> sortType) {
            int count = 0;
            boolean sorted = false;
            int temp;
            while (!sorted) {
                sorted = true;
                count++;

                for (int i = 0; i < array.length - 1; i++) {
                    if (sortType.test(i)) {
                        temp = array[i];
                        array[i] = array[i + 1];
                        array[i + 1] = temp;
                        sorted = false;
                    }
                }
            }

            // System.out.println("Iterations: " + count);
            return array;
        } 
          */
        


//////
      /* int[] sorted = IntStream.of(array)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .mapToInt(i -> i)
                .toArray();
        System.out.println("В порядке убывания:");
        for (int ss : sorted) {
            System.out.print(ss + ", ");
        }
        System.out.println();
        int[] reversed = IntStream.range(0, sorted.length)
                .map(i -> sorted[sorted.length - i - 1])
                .toArray();
        System.out.println("В порядке возрастания: ");

        for (int ss1 : reversed) {
            System.out.print(ss1 + ", ");
        }*/
//////





      /*  String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "December"};

        System.out.println(Arrays.toString(months)); //printing before

        //Самый чистый способ:

        Arrays.sort(months, comparingInt(String::length));
        //или со статическим импортом:

        Arrays.sort(months, comparingInt(String::length));
        //Однако это тоже сработает, но более подробное:

        Arrays.sort(months, (String a, String b) -> a.length() - b.length());
        //Или короче:

        Arrays.sort(months, (a, b) -> a.length() - b.length());
        //Наконец, ваш последний:

        Arrays.sort(months,
                (String a, String b) -> {
                    return Integer.signum(a.length() - b.length());
                }
        );

        System.out.println(Arrays.toString(months));
*/



/*Collections.sort(strings, new Comparator<String>() {
    @Override
    public int compare(String o1, String o2) {
        return o1.length()-o2.length();
    }


//Collections.sort(String,(o1,o2)-> o1.length()-o2.length());
    Runnable r1 = new Runnable() {
        @Override
        public void run() {
            System.out.println("LLL");
        }
    };
    Runnable r2=()-> System.out.println("LLL LLL");
    @Override
    public Comparator<String> reversed() {
        return null;
    }
});*/





       /* //для списка

        Collections.sort(array, Collections.reverseOrder());
        //для массива

        Arrays.sort(new int[][]{array}, Collections.reverseOrder());
        */



    }

}

