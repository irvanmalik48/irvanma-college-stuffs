/** Nama : Irvan Malik Azantha
 *  NIM : 09021282025060
 *  Kelas : TI 1 Reguler B
 *  Mata Kuliah : Algoritma dan Pemrograman 1
*/

package javaProj;

import java.util.Scanner;

public class Soal2 {
    static void input(int[] a, int i, int val) {
        a[i] = val;
    }

    static int hitung(int[] a, int n) {
        int x = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] % 2 == 0) {
                x++;
            }
        }
        return x;
    }

    static void show(int[] a, int result) {
        System.out.print("\nArray: ");
        for (int i : a)
            System.out.printf("%d ", i);
        System.out.printf("\nBanyaknya bilangan genap: %d", result);
    }

    public static void main(String[] args) {
        int[] a;
        int n, val, result;
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Masukkan N: ");
        n = scan.nextInt();
        a = new int[n];

        System.out.print("\nMasukkan nilai: ");
        for (int i = 0; i < n; i++) {
            val = scan.nextInt();
            input(a, i, val);
        }

        result = hitung(a, n);
        show(a, result);
    }
}