package javaProj;

import java.util.Scanner;

public class Matriks1 {
    public static void main(String[] args) {
        int[][] matrix;
        int m, n;
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan nilai m: ");
        m = scan.nextInt();
        System.out.print("Masukkan nilai n: ");
        n = scan.nextInt();
        matrix = new int[m][n];

        System.out.println("Masukkan nilai matriks: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scan.nextInt();
            }
        }
        System.out.print("\n");

        System.out.println("Matriks: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
}