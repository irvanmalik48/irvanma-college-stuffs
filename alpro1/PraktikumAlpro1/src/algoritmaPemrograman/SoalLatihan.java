package algoritmaPemrograman;

import java.util.Scanner;

public class SoalLatihan {

  public static void main(String args[]) {
    int a, b, c;
    int aCond = 0;
    int bCond = 0;
    int cCond = 0;
    int cond = 0;
    Scanner scan = new Scanner(System.in);

    System.out.print("Masukkan value pixel 1: ");
    a = scan.nextInt();
    System.out.print("Masukkan value pixel 2: ");
    b = scan.nextInt();
    System.out.print("Masukkan value pixel 3: ");
    c = scan.nextInt();

    if (a > 255) {
      aCond = 1;
      a = 255;
    } else if (a < 0) {
      aCond = 1;
      a = 0;
    }
    if (b > 255) {
      bCond = 1;
      b = 255;
    } else if (b < 0) {
      bCond = 1;
      b = 0;
    }
    if (c > 255) {
      cCond = 1;
      c = 255;
    } else if (c < 0) {
      cCond = 1;
      c = 0;
    }

    System.out.println("Input value pixel 1 : " + a);
    System.out.println("Input value pixel 2 : " + b);
    System.out.println("Input value pixel 3 : " + c);

    cond = aCond + bCond + cCond;

    System.out.println("Pemotongan yg dilakukan : " + cond + " kali");
  }
}
