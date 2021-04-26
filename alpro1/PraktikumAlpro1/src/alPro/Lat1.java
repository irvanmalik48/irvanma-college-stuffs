// Nama : Irvan Malik Azantha
// NIM : 09021282025060
// Mata Kuliah : Praktikum Algoritma dan Pemrograman 1
// Kelas : Reguler 1 B

package alPro;

import java.util.Scanner;

public class Lat1 {

  public static final int SUBSTRACT_VALUE = 100;
  public static final double PERCENTAGE = 0.1;

  public static void main(String args[]) {
    float bodyHeight, bodyWeight, step1, idealWeight, step2;
    Scanner scan = new Scanner(System.in);

    System.out.print("Masukkan tinggi badan: ");
    bodyHeight = scan.nextFloat();

    System.out.print("Masukkan berat badan: ");
    bodyWeight = scan.nextFloat();

    step1 = bodyHeight - SUBSTRACT_VALUE;
    step2 = step1 * (float) PERCENTAGE;
    idealWeight = step1 - step2;

    if (bodyWeight <= idealWeight + 2 && bodyWeight >= idealWeight - 2) {
      System.out.println("Berat badanmu ideal.");
    } else {
      System.out.println("Berat badanmu tidak ideal.");
      System.out.println(
        "Berat badan idealmu adalah antara " +
        (idealWeight - 2) +
        " - " +
        (idealWeight + 2) +
        " kg."
      );
    }
  }
}
