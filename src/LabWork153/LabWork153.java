package LabWork153;

import java.util.Scanner;

public class LabWork153 {



    public static void main(String[] args) {
        int i,j;
        System.out.printf(" * |");
        for(i=1; i<10; i++)
            System.out.printf("%2d ", i);
        System.out.printf("\n---|------------");
        System.out.printf("----------------\n");
        for(i=1; i<10; i++)
        {
            System.out.printf("%2d |", i);
            for(j=1; j<10; j++)
                System.out.printf("%2d ", i*j);
            System.out.printf("\n");
        }

    }

}

//    public static void main(String... args) {
////
//        Scanner r = new Scanner(System.in);
//        System.out.print("Видите размер таблицы по вертикали - ");
//        int n = r.nextInt();
//        System.out.print("Видите размер таблицы по горизонтали - ");
//        int l = r.nextInt();
//        for (int i = 1; i < n + 1; i++) {
//            for (int k = 1; k < l + 1; k++) {
//                System.out.printf("%4d", (k * i));}
//            System.out.println("");
//        }
//    }
//}


//    public static void main(String[] args) {
//        int[] pif = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        for (int q : pif) {
//            for (int w : pif) {
//                System.out.printf("%4d", (q * w));
//            }
//            System.out.println();
//        }
//    }
//}

