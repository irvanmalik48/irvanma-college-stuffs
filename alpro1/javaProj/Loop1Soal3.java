package javaProj;

import java.util.Scanner;

public class Loop1Soal3 {

  static void genap(int a) {
    for (int i = 1; i <= a; i++) if (i % 2 == 0) System.out.print(i + " ");
  }

  public static void main(String[] args) {
    int n;
    Scanner scan = new Scanner(System.in);
    System.out.print("TUGAS PERULANGAN 1 KELAS 1 REG B\nSOAL NOMOR 3\n");
    System.out.print("Masukkan N: ");
    n = scan.nextInt();
    genap(n);
  }
}
