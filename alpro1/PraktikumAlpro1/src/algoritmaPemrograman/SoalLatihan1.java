package algoritmaPemrograman;

import java.util.Scanner;

public class SoalLatihan1 {

  public static void main(String args[]) {
    int n, x, b = 0;
    char a;
    Scanner scan = new Scanner(System.in);

    System.out.println("--- KONDISI PERTAMA ---");
    System.out.println("Masukkan input N :");
    n = scan.nextInt();
    System.out.println();

    for (x = 0; x < n; x++) {
      System.out.print("Masukkan karakter : ");
      a = scan.next().charAt(0);
      System.out.println("Karakter ke " + (x + 1) + " adalah " + a);
      System.out.println();
    }
    System.out.println();

    System.out.println("--- KONDISI KEDUA ---");

    while (b != 1) {
      System.out.println("Masukkan karakter :");
      a = scan.next().charAt(0);

      if (a == '.') {
        b = 1;
        scan.close();
        break;
      } else {
        b = 0;
        System.out.println("Karakter yang anda input adalah " + a);
        System.out.println();
      }
    }
  }
}
