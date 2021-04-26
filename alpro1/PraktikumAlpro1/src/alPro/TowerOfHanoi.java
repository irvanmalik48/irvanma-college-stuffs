package alPro;

import java.util.Scanner;

public class TowerOfHanoi {

  public static void move(int n, int mulaidarisini, int sampekesini) {
    if (n == 0) {
      return;
    }
    int intermediatePole = 6 - mulaidarisini - sampekesini;
    move(n - 1, mulaidarisini, intermediatePole);
    System.out.println(
      "Move disk " +
      n +
      " from pole " +
      mulaidarisini +
      " to pole " +
      sampekesini
    );
    move(n - 1, intermediatePole, sampekesini);
  }

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter number of disk: ");
    move(scan.nextInt(), 1, 3);
  }
}
