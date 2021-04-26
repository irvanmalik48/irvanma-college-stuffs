package algoritmaPemrograman;

import java.util.Scanner;

public class SoalLatihan4 {

  public static void main(String args[]) {
    int a, b, c, n;
    Scanner scan = new Scanner(System.in);

    System.out.print("n = ");
    n = scan.nextInt();

    for (a = 1; a <= n; a++) {
      for (b = n - 1; b >= a; b--) {
        System.out.print("!");
      }
      for (c = 1; c <= a; c++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
