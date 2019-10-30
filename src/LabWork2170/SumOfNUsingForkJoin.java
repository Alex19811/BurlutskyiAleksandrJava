package LabWork2170;



import java.util.concurrent.RecursiveTask;

// Этот класс иллюстрирует, как мы можем вычислить сумму чисел 1..N с использованием структуры fork / join.
// Диапазон чисел делится пополам, пока поток не будет обработан потоком.
// После завершения суммирования диапазона результат суммируется вместе.
    public class SumOfNUsingForkJoin {
    protected static long N = 1000_000L;  // миллион - мы хотим вычислить сумму
    // из 1 .. миллиона
    public static final int NUM_THREADS = 10; // количество потоков для создания

    // распределения усилий
// Это рекурсивная реализация алгоритма; Наследовать от RecursiveTask
// вместо RecursiveAction, так как мы возвращаем значения.
    static class RecSumOfN extends RecursiveTask<Long> {
        long from, to;

        // из и в это диапазон значений для sum- до
        public RecSumOfN(long from, long to) {
            this.from = from;
            this.to = to;
        }

        // метод выполняет fork и join для вычисления суммы.

        // если диапазон значений может быть суммирован потоком
// (помните, что мы хотим разделить задачу суммирования поровну между NUM_THREADS)
// тогда, суммируйте диапазон чисел от ... до простого цикла for
// в противном случае раскошелить диапазон и объединить результаты
        public Long compute() {
            if ((to - from) <= N / NUM_THREADS) {
// диапазон - это то, что может быть обработано потоком, так что суммирование
                long localSum = 0;
// добавляем в диапазон 'от' .. 'до' включительно значения 'до'
                for (long i = from; i <= to; i++) {
                    localSum += i;
                }
                System.out.printf("\t Summing of value range %d to %d is %d %n",
                        from, to, localSum);
                return localSum;
            } else { // нет, диапазон велик для нити для обработки, так раскошелиться вычислениями
                // находит значение в средней точке в диапазоне from..to
                long mid = (from + to) / 2;
                System.out.printf("Forking computation into two ranges: " +
                        "%d to %d and %d to %d %n", from, mid, mid, to);
// определить вычисления для первой половины в диапазоне от..mid
                RecSumOfN firstHalf = new RecSumOfN(from, mid);
// теперь раскошелиться на эту задачу
                firstHalf.fork();
// определить вычисление для второй половины с диапазоном mid + 1..to
                RecSumOfN secondHalf = new RecSumOfN(mid + 1, to);
                long resultSecond = secondHalf.compute();
// теперь дождемся завершения первой половины вычислительной суммы,
// когда закончим , добавим ее к оставшейся части
                return firstHalf.join() + resultSecond;
            }
        }
    }
}