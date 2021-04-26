package javaProj.Mod2;

import java.util.Scanner;

public class Soal4 {

  static boolean apakah_a(char x) {
    if (x == 'a') return true; else return false;
  }

  public static void main(String[] args) {
    char x;
    Scanner scan = new Scanner(System.in);

    System.out.print("Masukkan karakter: ");
    x = scan.next().charAt(0);

    if (apakah_a(x) == true) System.out.print("benar"); else System.out.print(
      "salah"
    );
  }
}
