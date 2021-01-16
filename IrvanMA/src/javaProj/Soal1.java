/** Nama : Irvan Malik Azantha
 *  NIM : 09021282025060
 *  Kelas : TI 1 Reguler B
 *  Mata Kuliah : Algoritma dan Pemrograman 1
*/

package javaProj;

import java.util.Scanner;

public class Soal1 {
    static void input(int[] a, int i, int val) {
        a[i] = val;
    }

    static void pindah(int[] a, int[] b, int n) {
        for (int i = 0; i < n; i++)
            b[i] = a[i];
    }

    static void tampilElemen(int[] a, int[] b) {
        System.out.print("\nArray A: ");
        for (int i : a)
            System.out.printf("%d ", i);
        System.out.print("\nArray B: ");
        for (int i : b)
            System.out.printf("%d ", i);
    }
    
    public static void main(String[] args) {
        int[] a, b;
        int n, val;
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Masukkan N: ");
        n = scan.nextInt();
        a = new int[n];
        b = new int[n];

        System.out.print("\nMasukkan nilai: ");
        for (int i = 0; i < n; i++) {
            val = scan.nextInt();
            input(a, i, val);
        }

        pindah(a, b, n);
        tampilElemen(a, b);
    }
}