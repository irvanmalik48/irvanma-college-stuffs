package randomProjects;

import java.util.Scanner;

public class TestForAnu {

  public static void main(String args[]) {
    int n, a;
    Scanner scan = new Scanner(System.in);

    System.out.print("n = ");
    n = scan.nextInt();

    System.out.println();
    for (a = 1; a <= n; a++) {
      System.out.print(a);
      System.out.print(-a++);
    }
  }
}
