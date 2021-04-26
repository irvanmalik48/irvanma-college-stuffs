package javaProj.Misc;

import java.util.Scanner;

public class Soal3 {

  static void calculate(float a, float[] hasil, char one, char two) {
    Character.toLowerCase(one);
    Character.toLowerCase(two);
    if (one == 'c' && two == 'k') hasil[0] = a + 273; else if (
      one == 'k' && two == 'c'
    ) hasil[0] = a - 273; else if (one == 'c' && two == 'r') hasil[0] =
      (4 * a) / 5; else if (one == 'r' && two == 'c') hasil[0] =
      (5 * a) / 4; else if (one == 'c' && two == 'f') hasil[0] =
      ((9 * a) / 5) + 32; else if (one == 'f' && two == 'c') hasil[0] =
      (5 * (a - 32)) / 9; else if (one == 'f' && two == 'r') hasil[0] =
      (4 * (a - 32)) / 9; else if (one == 'r' && two == 'f') hasil[0] =
      ((9 * a) / 4) + 32; else if (one == 'f' && two == 'k') hasil[0] =
      (5 * (a - 32) / 9) + 273; else if (one == 'r' && two == 'k') hasil[0] =
      ((4 * a) / 5) + 273; else if (one == 'k' && two == 'f') hasil[0] =
      (9 * (a - 273) / 5) + 32; else if (one == 'k' && two == 'r') hasil[0] =
      (4 * (a - 273)) / 2;
  }

  public static void main(String[] args) {
    float a;
    float[] hasil = { 0 };
    char one, two;
    Scanner scan = new Scanner(System.in);

    System.out.print("Konversi dari (c, f, r, k): ");
    one = scan.next().charAt(0);
    System.out.print("Menuju (c, f, r, k): ");
    two = scan.next().charAt(0);
    System.out.print("Nilai: ");
    a = scan.nextFloat();

    calculate(a, hasil, one, two);

    System.out.printf("Hasil konversi: %.2f %s", hasil[0], two);
  }
}
