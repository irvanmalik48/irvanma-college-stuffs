package javaProj.Misc;

import java.util.Scanner;

public class Soal2 {

  static void deret(int n, int[] hasil) {
    int a = 0;
    for (int i = 1; i <= n; i++) {
      if (i % 3 == 1) {
        hasil[a] = i;
        a++;
      }
    }
  }

  public static void main(String[] args) {
    int[] hasil = { 0 };
    int a = 0, n;
    Scanner scan = new Scanner(System.in);

    System.out.print("Masukkan N: ");
    n = scan.nextInt();
    hasil = new int[n];

    deret(n, hasil);
    for (int i = 1; i <= n; i++) {
      if (i % 3 == 1) {
        System.out.printf("%d ", hasil[a]);
        a++;
      }
    }
  }
}
