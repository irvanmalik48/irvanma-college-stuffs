package javaProj.Misc;

import java.util.Scanner;

public class Soal4 {

  static void triangle(int n) {
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++) System.out.print("*");
      System.out.print("\n");
    }
  }

  static void square(int n) {
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= n; j++) System.out.print("*");
      System.out.print("\n");
    }
  }

  static void rectangle(int n) {
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= (2 * n); j++) System.out.print("*");
      System.out.print("\n");
    }
  }

  public static void main(String[] args) {
    char pilihan;
    int n;
    Scanner scan = new Scanner(System.in);

    System.out.print(
      "(a) segitiga\n(b) persegi\n(c) persegi panjang\nPilihan: "
    );
    pilihan = scan.next().charAt(0);
    System.out.print("Masukkan N: ");
    n = scan.nextInt();

    switch (pilihan) {
      case 'a':
        triangle(n);
        break;
      case 'b':
        square(n);
        break;
      case 'c':
        rectangle(n);
        break;
    }
    scan.close();
  }
}
