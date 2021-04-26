package alPro;

import java.util.Scanner;

public class Soal5 {

  public static void main(String args[]) {
    int a, b, c;
    Scanner scan = new Scanner(System.in);
    System.out.println(
      "Menghitung nilai C dari rumus dibawah dengan menginput nilai A"
    );
    System.out.println("B = 2(A * A) - 1");
    System.out.println("C = (73 + B) / 3");
    System.out.println();

    System.out.println("Masukkan nilai A: ");
    a = scan.nextInt();

    b = 2 * (a * a) - 1;
    c = (73 + b) / 3;

    System.out.println();
    System.out.println("Maka hasilnya adalah: " + c);
  }
}
