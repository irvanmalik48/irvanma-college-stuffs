package algoritmaPemrograman;

import java.util.Scanner;

public class SoalLatihan3 {

  public static void main(String args[]) {
    int a, n, hasil = 0;
    Scanner scan = new Scanner(System.in);

    System.out.println("Menghitung Deret Genap");
    System.out.print("N = ");
    n = scan.nextInt();

    for (a = 2; a <= n; a += 2) {
      System.out.print(a + " ");
      hasil = hasil + a;
    }
    System.out.println();
    System.out.print("Jumlah = " + hasil);
  }
}
