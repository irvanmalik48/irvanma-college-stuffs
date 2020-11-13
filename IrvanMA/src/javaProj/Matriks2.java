package javaProj;

import java.util.Scanner;

public class Matriks2 {
    public static void main(String[] args) {
        int[][] matrix1;
        int[][] matrix2;
        int m, n;
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan nilai m: ");
        m = scan.nextInt();
        System.out.print("Masukkan nilai n: ");
        n = scan.nextInt();
        matrix1 = new int[m][n];
        matrix2 = new int[m][n];

        System.out.println("Masukkan nilai matriks: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix1[i][j] = scan.nextInt();
            }
        }
        System.out.print("\n");

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix2[i][j] = matrix1[i][j];
            }
        }

        System.out.println("Matriks: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix2[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
}