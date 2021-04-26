package alPro;

import java.util.Scanner;

public class Faktorial {

  private static Scanner input;

  public static void main(String[] args) {
    input = new Scanner(System.in);
    int N, result = 1;
    do {
      System.out.print("Please enter the value of N: ");
      N = input.nextInt();
    } while (N < 0);
    for (int i = 1; i <= N; i++) {
      result = result * i;
    }
    System.out.println(N + "! = " + result);
  }
}
