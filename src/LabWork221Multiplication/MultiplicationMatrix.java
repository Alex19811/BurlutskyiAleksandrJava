package LabWork221Multiplication;

public class  MultiplicationMatrix {
    public static void main(String[] args) {
        int[][] mA =
                       {{2, 2, 2},
                        {2, 2, 2},
                        {2, 2, 2},
                        {2, 2, 2},
                        {2, 2, 2}};

        int[][] mB =
                       {{3, 3, 3, 3},
                        {3, 3, 3, 3},
                        {3, 3, 3, 3}};


        int m = mA.length;
        int n = mB[0].length;
        int o = mB.length;
        int[][] res = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < o; k++) {
                    res[i][j] += mA[i][k] * mB[k][j];
                }
            }
        }

        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res[0].length; j++) {
                System.out.format("%6d ", res[i][j]);
            }
            System.out.println();
        }
    }
}
