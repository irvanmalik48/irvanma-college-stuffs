package javaProj;

import java.util.Scanner;

public class BilanganTiga {

  static void deret(int a) {
    int b;
    for (int i = 1; i <= a * 2; i++) {
      b = 3 * i;
      if (b % 2 != 0) {
        System.out.print(b + " ");
      }
    }
  }

  public static void main(String[] args) {
    int a;
    Scanner s = new Scanner(System.in);
    System.out.print("a = ");
    a = s.nextInt();
    deret(a);
  }
}
