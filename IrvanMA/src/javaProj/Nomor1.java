package javaProj;

import java.util.Scanner;

public class Nomor1 {

  static double sqrt(double d) {
    double temp;
    double squareRoot = d / 2;
    do {
      temp = squareRoot;
      squareRoot = (temp + (d / temp)) / 2;
    } while ((temp - squareRoot) != 0);
    return squareRoot;
  }

  static double calculate(double x1, double x2, double y1, double y2) {
    double jarak = (sqrt((x2 - x1) * (x2 - x1) + ((y2 - y1) * (y2 - y1))));
    return jarak;
  }

  public static void main(String[] args) {
    double[] x, y;
    int n;
    double[] arr;
    double total = 0;
    Scanner scan = new Scanner(System.in);
    System.out.print("N = ");
    n = scan.nextInt();
    x = new double[n];
    y = new double[n];
    arr = new double[n];

    for (int i = 0; i < n; i++) {
      System.out.print("x = ");
      x[i] = scan.nextInt();
      System.out.print("y = ");
      y[i] = scan.nextInt();
    }

    for (int i = 0; i < (n - 1); i++) {
      arr[i] = calculate(x[i], x[i + 1], y[i], y[i + 1]);
      total += arr[i];
    }

    System.out.print(total);
  }
}
