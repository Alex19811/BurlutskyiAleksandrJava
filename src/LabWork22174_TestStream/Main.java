package LabWork22174_TestStream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;
import static jdk.nashorn.internal.objects.NativeArray.forEach;

public class Main {
    public static void main(String[] args) {
        Stream.iterate(10, n -> n + 10)
                .limit(10)
                .map(n -> n / 2)
                .collect(Collectors.toList())
                .forEach(System.out::println);

        System.out.println();

        Stream.of("Февраль", "Январь", "Май", "Март", "Июль", "Апрель", "Июнь", "Сентябрь", "Август", "Октябрь")
                .sorted()
                .skip(2)
                .forEach(System.out::println);

        System.out.println();


        List<Person> persons = Arrays.asList(
                new Person("Vlad", 18, "men"),
                new Person("Jack", 25, "men"),
                new Person("Kolya", 30, "men"),
                new Person("Inna", 20, "women"),
                new Person("Olya", 17, "women")
        );


        List namesOfGenderCollect = persons
                .stream()
                .filter(p -> p.getGender() == "men")
                .filter(p -> p.getAge() >= 18)
                .filter(p -> p.getAge() <= 27)
                .map(p -> p.getName())
                .collect(Collectors.toList());
        System.out.println("Мужчины от 18 до 27 лет:" + namesOfGenderCollect);


        double average = persons.stream()
                .filter(p -> p.getGender() == "women")
                .mapToInt(Person::getAge)
                .average().getAsDouble();
        System.out.println("Средний возраст women: " + average);









/*

        Person result1 = persons.stream()                       //Convert to steam
                .filter(x -> "jack".equals(x.getName()))       //we want "jack" only
                .findAny()                                     //If 'findAny' then return found
                .orElse(null);                                 //If not found, return null

        System.out.println(result1);

        Person result2 = persons.stream()
                .filter(x -> "ahmook".equals(x.getName()))
                .findAny()
                .orElse(null);

        System.out.println(result2);
*/

    }

//        Stream.of()
//                .filter()
//                .forEach()
//                .mapToInt()
//                .average().getAsDouble()
//
//    }
}
