package javaProj;

import java.util.Scanner;

public class MegahUnited {

  static void irvanmalik(int a, int b) {
    System.out.printf("Hasil = %d", (a + b));
  }

  static void bintang(int a, int b) {
    System.out.printf("Hasil = %d", (a - b));
  }

  static void bayu(int a, int b) {
    System.out.printf("Hasil = %d", (a * b));
  }

  static void aulia(int a, int b) {
    System.out.printf("Hasil = %d", (a / b));
  }

  public static void main(String[] args) {
    int a = 10, b = 2;
    char input;
    Scanner scan = new Scanner(System.in);
    input = scan.next().charAt(0);

    switch (input) {
      case '+':
        irvanmalik(a, b);
        break;
      case '-':
        bintang(a, b);
        break;
      case '*':
        bayu(a, b);
        break;
      case '/':
        aulia(a, b);
        break;
    }
  }
}
