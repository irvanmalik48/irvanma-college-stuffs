package javaProj;

import java.util.Scanner;

public class FaktorPer {

  static int euclid(int a, int b) {
    if (a == 0) {
      return b;
    }
    return euclid(b % a, a);
  }

  public static void main(String[] args) {
    int a, b, c, d, e;
    Scanner s = new Scanner(System.in);
    System.out.print("a = ");
    a = s.nextInt();
    System.out.print("b = ");
    b = s.nextInt();
    c = euclid(a, b);
    if (a % c == 0 && b % c == 0) {
      d = a / c;
      e = b / c;
      System.out.printf("\n%d", c);
      System.out.printf("\n%d * %d = %d", c, d, a);
      System.out.printf("\n%d * %d = %d", c, e, b);
    } else {
      System.out.printf("\n%d", c);
      System.out.printf(
        "\n%d dan %d tidak mempunyai bilangan trivial yang sama.",
        a,
        b
      );
    }
  }
}
