package LabWork2170;




import java.util.concurrent.ForkJoinPool;

import static LabWork2170.SumOfNUsingForkJoin.NUM_THREADS;
import static javafx.scene.input.KeyCode.N;

public class Main {
    public static void main (String [] args) {

// Создаем пул форк-соединения, состоящий из NUM_THREADS
        ForkJoinPool pool = new ForkJoinPool(NUM_THREADS);
// отправить задачу вычислений в пул разветвленного соединения
        long N = 23;
        long computedSum = pool.invoke(new SumOfNUsingForkJoin.RecSumOfN(0L, N));

// это сумма формулы для диапазона 1..N
        long formulaSum = (N * (N + 1)) / 2;
// Сравнить вычисленную сумму и формулу суммы
        System.out.printf("Sum for range 1..%d; computed sum = %d, formula sum = %d %n", N,
                computedSum, formulaSum);
    }
}
