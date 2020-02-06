package AAA_JavaNewFeatures;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {


       /* List<Integer> i1= Arrays.asList(1,2,3);
        List<Integer> i2= Arrays.asList(4,5,6);
        List<Integer> i3= Arrays.asList();
        Stream.of(i1,i2,i3).map(x->x+1)
                .flatMap(x-> x.stream()).forEach(System.out::print);*/



       /* LongStream is = LongStream.of(1,2,3);
        OptionalLong opt = is.map(n->n*10).filter(n->n<5).findFirst();

        //if (opt.isPresent()) System.out.println(opt.getAsLong());
            //opt.ifPresent(System.out.println);
        //opt.ifPresent(System.out::println);
            //None of these; the code throws an exception at runtime;
            //None of these; the code does not compile;
            //if (opt.isPresent()) System.out.println(opt.get());

*/
        /*Stream<String> s= Stream.generate(()->"meow");
        boolean match = s.allMatch(String::isEmpty);
        System.out.println(match);*/

        /*ZoneId zone = ZoneId.of("US/Eastern");
        LocalDate date4 =

                //LocalDate.of(2016, 3, 40);
                //LocalDate.of (2017, 2, 29);
        //LocalDate.of (2016, 11, 6);
        //LocalDate.of (2016, 3, 13);
        //LocalDate.of (2016, 11, 7);

        LocalTime time1 = LocalTime.of(2, 15);
        ZonedDateTime a = ZonedDateTime.of(date4, time1, zone);*/
        /*
LocalDate date =
        //LocalDate.of(2014, 6, 21);
           //new LocalDate(2014, 5, 21);
        //LocalDate.of(2014, Month.JUNE, 21);
           //LocalDate.of(2014, 5, 21);
           //new LocalDate(2014, 6, 21);
           //LocalDate.of(2014, Calendar.JUNE, 21);
        System.out.println(date);
*/


       /* DoubleStream s = DoubleStream.of(1.2, 2.4);
        s.peek(System.out::print).filter(x->x>2).count();
                */
                
        /*LocalDate date =  LocalDate.of(2018,Month.APRIL,40);

        System.out.println(date.getYear()+ " " + date.getMonth()+ " " +
        date.getDayOfMonth());*/

       /*Stream<String> st =Stream.iterate("",(s)->s+"1");
        System.out.println(st.limit(2).map(x->x+"2"));*/

        /* Stream<Integer> s= Stream.of(1);
        IntStream is = s.mapToInt(x->x);
        DoubleStream ds = s.mapToDouble(x->x);
        Stream<Integer> s2= ds.mapToInt(x->x);
        s2.forEach(System.out::print);*/


        /*Predicate<? super String> predicate = s-> s.startsWith("g");
        Stream<String> s1=Stream.generate(()->"growl!");
        Stream<String> s2=Stream.generate(()->"growl!");
        boolean b1 = s1.anyMatch(predicate);
        boolean b2 = s2.anyMatch(predicate);
        System.out.println(b1+ " "+b2);*/

     /*   Predicate<? super String> predicate = s-> s.length()>3;
        Stream<String> s1=Stream.iterate("_", (s)->s+s);
        boolean b1 = s1.noneMatch(predicate);
        boolean b2 = s1.anyMatch(predicate);
        System.out.println(b1+ ""+b2);*/

        /* Stream<String> s = Stream.empty();
        Stream<String> s2 = Stream.empty();

        Map<Boolean, List<String>> p=s.collect(
                Collectors.partitioningBy(b->b.startsWith("c")));
        Map<Boolean, List<String>> g=s2.collect(
                Collectors.groupingBy(b->b.startsWith("c")));
        System.out.println(p+""+g);*/
    }
}
