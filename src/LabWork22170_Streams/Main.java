package LabWork22170_Streams;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        IntStream.range(0, 10)
                .limit(5)
                .skip(3)
                .forEach(System.out::println);

        IntStream.range(0, 10)
                .skip(5)
                .limit(3)
                .skip(1)
                .forEach(System.out::println);
//Сортирует элементы стрима.
        Stream.of(120, 410, 85, 32, 314, 12)
                .sorted()
                .forEach(System.out::println);
        //Убирает повторяющиеся элементы и возвращаем стрим с уникальными элементами.

        Stream.of(2, 1, 8, 1, 3, 2)
                .distinct()
                .forEach(System.out::println);

        boolean result = Stream.of(120, 410, 85, 32, 314, 12)
                .allMatch(x -> x %22 == 0);


    }

}
