/** Nama : Irvan Malik Azantha
 *  NIM : 09021282025060
 *  Kelas : TI 1 Reguler B
 *  Mata Kuliah : Algoritma dan Pemrograman 1
*/

package javaProj;

import java.util.Scanner;

public class Soal4 {
    static void input(int[] arr, int i, int val) {
        arr[i] = val;
    }

    static void hitung(int[] a, int[] b, int[] c, int n) {
        for (int i = 0; i < n; i++)
            c[i] = a[i] + b[i];
    }

    static void tampilElemen(int[] c) {
        System.out.print("\nArray C: ");
        for (int i : c)
            System.out.printf("%d ", i);
    }

    public static void main(String[] args) {
        int[] a, b, c;
        int n, val;
        Scanner scan = new Scanner(System.in);

        System.out.print("Masukkan N: ");
        n = scan.nextInt();
        a = new int[n];
        b = new int[n];
        c = new int[n];

        System.out.print("\nMasukkan nilai array A: ");
        for (int i = 0; i < n; i++) {
            val = scan.nextInt();
            input(a, i, val);
        }

        System.out.print("\nMasukkan nilai array B: ");
        for (int i = 0; i < n; i++) {
            val = scan.nextInt();
            input(b, i, val);
        }

        System.out.print("\nArray A: ");
        for (int i : a)
            System.out.printf("%d ", i);
        System.out.print("\n\t + ");
        System.out.print("\nArray B: ");
        for (int i : b)
            System.out.printf("%d ", i);
        System.out.print("\n\t = ");
        
        hitung(a, b, c, n);
        tampilElemen(c);
    }
}
