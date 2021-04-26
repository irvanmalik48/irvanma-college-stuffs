package algoritmaPemrograman;

import java.util.Scanner;

public class Soal3 {

  public static void main(String args[]) {
    float x, y;
    Scanner scan = new Scanner(System.in);

    System.out.print("Masukkan nilai x : ");
    x = scan.nextFloat();
    System.out.print("Masukkan nilai y : ");
    y = scan.nextFloat();

    if (x > 0 && y > 0) {
      System.out.println("Kuadran 1");
    } else if (x < 0 && y > 0) {
      System.out.println("Kuadran 2");
    } else if (x < 0 && y < 0) {
      System.out.println("Kuadran 3");
    } else {
      System.out.println("Kuadran 4");
    }
  }
}
