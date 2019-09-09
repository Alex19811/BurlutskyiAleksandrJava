package LabWork2144.TestGenerics3;

import java.util.Arrays;
import java.util.Random;

public class MyMixer<T> {

    T[] ar;

    public MyMixer(T[] ar) {
        this.ar = ar;
    }


    public  <T> T[] shuffle(T[] ar) {
       Random rnd = new Random();
        for (int i = ar.length - 1; i >= 0; i--) {
            int index = rnd.nextInt(i + 1);
            T a = ar[index];
            ar[index] = ar[i];
            ar[i] = a;
        }
        System.out.println(ar);
        return ar;
    }
}



/*public static <T> void shuffle(T[] arr, Random rand) {
        if (rand == null) {
            rand = new Random();
        }

        for (int i = arr.length - 1; i > 0; i--) {
            //swap(arr, i, arr.nextInt(i + 1));
        }
    }

    public static <T> void swap(T[] arr, int i, int j) {
        T tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    public static <T> T[] shuffled(T[] arr) {
        T[] copy = Arrays.copyOf(arr, arr.length);
        shuffle(copy,new Random());
        return copy;
    }
}*/