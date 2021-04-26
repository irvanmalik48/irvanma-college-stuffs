package randomProjects;

import java.util.Scanner;

public class Test2 {

  public static void main(String args[]) {
    int a, b, c, d;
    Scanner scan = new Scanner(System.in);

    System.out.print("x = ");
    d = scan.nextInt();

    for (a = 1; a <= d; a++) {
      for (b = d - 1; b >= a; b--) {
        System.out.print("!");
      }
      for (c = 1; c <= a; c++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
