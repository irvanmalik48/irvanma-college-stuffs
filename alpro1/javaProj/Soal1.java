/** Nama : Irvan Malik Azantha
 *  NIM : 09021282025060
 *  Kelas : TI 1 Reguler B
 *  Mata Kuliah : Praktikum Pemrograman dan Algoritma 1
*/

package javaProj;

import java.util.Scanner;

public class Soal1 {
    static void calculate(int n) {
        int counter = 0;
        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0)
                counter++;
        }
        System.out.printf("\nBanyaknya bilangan prima pertama: %d", counter);
    }

    public static void main(String[] args) {
        int n;
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan nilai N: ");
        n = scan.nextInt();
        calculate(n);
    }
}