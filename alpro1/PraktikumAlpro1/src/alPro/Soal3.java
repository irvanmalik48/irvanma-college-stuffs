package alPro;

import java.util.Scanner;

public class Soal3 {

  public static void main(String args[]) {
    int tahunLahir, umur;
    int tahunSekarang = 2020;
    Scanner scan = new Scanner(System.in);

    System.out.println("Menentukan Umur");
    System.out.println();

    System.out.print("Masukkan tahun lahir: ");
    tahunLahir = scan.nextInt();

    while (tahunLahir > tahunSekarang) {
      System.out.println("Harap masukkan tahun lahir yang valid.");
      tahunLahir = scan.nextInt();
    }

    umur = tahunSekarang - tahunLahir;

    System.out.println("Umur anda sekarang adalah " + umur + " tahun");
  }
}
