package javaProj;

import java.util.Scanner;

public class InversMatriks {
    public static void main(String[] args) {
        int[][] arr;
        int a, b, c, d, e, f, determinan;
        int minA, minB, minC, minD, minE, minF, minG, minH, minI;
        arr = new int[3][3];
        Scanner scan = new Scanner(System.in);
        System.out.print("Menentukan Matriks Invers Ordo 3x3\n");
        
        System.out.println("Masukkan value matriks: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = scan.nextInt();
            }
        }

        System.out.print("\nMatriks: \n");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.print("\n");
        }

        // Mencari determinan
        a = arr[0][0] * arr[1][1] * arr[2][2];
        b = arr[0][1] * arr[1][2] * arr[2][0];
        c = arr[0][2] * arr[1][0] * arr[2][1];
        d = arr[0][2] * arr[1][1] * arr[2][0];
        e = arr[0][0] * arr[1][2] * arr[2][1];
        f = arr[0][1] * arr[1][0] * arr[2][2];
        determinan = (a + b + c) - (d + e + f);
        
        if  (determinan == 0) {
            System.out.print("Determinan matriks bernilai nol.\n");
            System.out.print("Matriks adalah matriks singular.");
        } else {
            // Mencari nilai minor
            minA = (arr[1][1] * arr[2][2]) - (arr[1][2] * arr[2][1]);
            minB = (arr[1][0] * arr[2][2]) - (arr[2][0] * arr[2][1]);
            minC = (arr[1][0] * arr[2][1]) - (arr[1][1] * arr[2][0]);
            minD = (arr[0][1] * arr[2][2]) - (arr[0][2] * arr[2][1]);
            minE = (arr[0][0] * arr[2][2]) - (arr[2][0] * arr[0][2]);
            minF = (arr[0][0] * arr[2][1]) - (arr[0][1] * arr[2][0]);
            minG = (arr[0][1] * arr[1][2]) - (arr[0][2] * arr[1][1]);
            minH = (arr[0][0] * arr[1][2]) - (arr[1][0] * arr[0][2]);
            minI = (arr[0][0] * arr[1][1]) - (arr[0][1] * arr[1][0]);

            // Kofaktor
            int[][] kofaktor = {
                {0 + minA, 0 - minB, 0 + minC},
                {0 - minD, 0 + minE, 0 - minF},
                {0 + minG, 0 - minH, 0 + minI}
            };

            // Adjoin
            int[][] adjoin = {
                {kofaktor[0][0], kofaktor[1][0], kofaktor[2][0]},
                {kofaktor[0][1], kofaktor[1][1], kofaktor[2][1]},
                {kofaktor[0][2], kofaktor[1][2], kofaktor[2][2]}
            };

            // Invers matriks
            String[][] invers = {
                {(adjoin[0][0] + "/" + determinan), (adjoin[0][1] + "/" + determinan), (adjoin[0][2] + "/" + determinan)},
                {(adjoin[1][0] + "/" + determinan), (adjoin[1][1] + "/" + determinan), (adjoin[1][2] + "/" + determinan)},
                {(adjoin[2][0] + "/" + determinan), (adjoin[2][1] + "/" + determinan), (adjoin[2][2] + "/" + determinan)}
            };

            System.out.print("Determinan matriks: " + determinan + "\n");
            System.out.print("Matriks invers: \n");
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(invers[i][j] + " ");
                }
                System.out.print("\n");
            }
        }
        scan.close();
    }
}