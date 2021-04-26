/** Nama : Irvan Malik Azantha
 *  NIM : 09021282025060
 *  Kelas : TI 1 Reguler B
 *  Mata Kuliah : Algoritma dan Pemrograman 1
 */

package javaProj;

import java.util.Scanner;

public class Soal3 {

  static void input(int[] a, int i, int val) {
    a[i] = val;
  }

  static void cariPosisiGanjil(int[] a, int[] posisi, int n) {
    for (int i = 0; i < n; i++) if (a[i] % 2 == 1) posisi[0] = i;
  }

  static void tampilPosisiGanjil(int[] a, int[] posisi) {
    System.out.print("\nArray: ");
    for (int i : a) System.out.printf("%d ", i);
    if (posisi[0] == -1) System.out.printf(
      "\nIndeks terbesar bilangan ganjil: %d",
      posisi[0]
    ); else System.out.printf(
      "\nIndeks terbesar bilangan ganjil: %d dengan nilai %d",
      posisi[0],
      a[posisi[0]]
    );
  }

  public static void main(String[] args) {
    int[] a, posisi = { -1 };
    int n, val;
    Scanner scan = new Scanner(System.in);

    System.out.print("Masukkan N: ");
    n = scan.nextInt();
    a = new int[n];

    System.out.print("\nMasukkan nilai: ");
    for (int i = 0; i < n; i++) {
      val = scan.nextInt();
      input(a, i, val);
    }

    cariPosisiGanjil(a, posisi, n);
    tampilPosisiGanjil(a, posisi);
  }
}
