package javaProj;

import java.util.Scanner;

public class Faktorial {

  public static void main(String[] args) {
    int n, hasil = 1;
    Scanner s = new Scanner(System.in);
    System.out.print("Masukkan nilai faktorial: ");
    n = s.nextInt();
    for (int i = n; i > 0; i--) {
      hasil *= i;
    }
    System.out.println(hasil);
  }
}
