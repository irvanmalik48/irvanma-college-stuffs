package algoritmaPemrograman;

import java.util.Scanner;

public class SoalLatihan2 {

  public static void main(String args[]) {
    int a, n, hasil = 0;
    Scanner scan = new Scanner(System.in);

    System.out.println("Menghitung Deret Ganjil");
    System.out.print("N = ");
    n = scan.nextInt();

    for (a = 1; a <= n; a += 2) {
      System.out.print(a + " ");
      hasil = hasil + a;
    }
    System.out.println();
    System.out.println("Jumlah = " + hasil);
  }
}
