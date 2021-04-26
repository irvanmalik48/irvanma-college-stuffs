// Nama : Irvan Malik Azantha
// NIM : 09021282025060
// Mata Kuliah : Algoritma dan Pemrograman 1
// Kelas : Reguler 1 B

package quizAlpro2;

import java.util.Scanner;

public class Soal2 {

  public static void main(String args[]) {
    int nasiG = 18000;
    int mieG = 15000;
    int kwetiau = 20000;
    int a = 0;
    int b = 0;
    int c = 0;
    int item, total;
    Scanner scan = new Scanner(System.in);

    System.out.println("Pilihan");
    System.out.println("1. Nasi Goreng " + "(" + nasiG + ")");
    System.out.println("2. Mie Goreng " + "(" + mieG + ")");
    System.out.println("3. Kwetiau " + "(" + kwetiau + ")");
    System.out.println("====================================");
    System.out.print("Masukkan jumlah item yang dipesan: ");
    item = scan.nextInt();
    System.out.println();
    while (item <= 0 || item > 3) {
      System.out.println("Error = Input lebih dari 3 atau tak valid");
      System.out.print("Masukkan jumlah item yang dipesan: ");
      item = scan.nextInt();
      System.out.println();
    }

    if (item == 1) {
      System.out.print("Masukkan pilihan item ke 1: ");
      a = scan.nextInt();
      System.out.println();
      while (a <= 0) {
        System.out.println("Error = Input tak valid");
        System.out.print("Masukkan pilihan item ke 1: ");
        a = scan.nextInt();
        System.out.println();
      }
    } else if (item == 2) {
      System.out.print("Masukkan pilihan item ke 1: ");
      a = scan.nextInt();
      System.out.println();
      while (a <= 0) {
        System.out.println("Error = Input tak valid");
        System.out.print("Masukkan pilihan item ke 1: ");
        a = scan.nextInt();
        System.out.println();
      }

      System.out.print("Masukkan pilihan item ke 2: ");
      b = scan.nextInt();
      System.out.println();
      while (b <= 0) {
        System.out.println("Error = Input tak valid");
        System.out.print("Masukkan pilihan item ke 2: ");
        b = scan.nextInt();
        System.out.println();
      }
    } else if (item == 3) {
      System.out.print("Masukkan pilihan item ke 1: ");
      a = scan.nextInt();
      System.out.println();
      while (a <= 0) {
        System.out.println("Error = Input tak valid");
        System.out.print("Masukkan pilihan item ke 1: ");
        a = scan.nextInt();
        System.out.println();
      }

      System.out.print("Masukkan pilihan item ke 2: ");
      b = scan.nextInt();
      System.out.println();
      while (b <= 0) {
        System.out.println("Error = Input tak valid");
        System.out.print("Masukkan pilihan item ke 2: ");
        b = scan.nextInt();
        System.out.println();
      }

      System.out.print("Masukkan pilihan item ke 3: ");
      c = scan.nextInt();
      System.out.println();
      while (c <= 0) {
        System.out.println("Error = Input tak valid");
        System.out.print("Masukkan pilihan item ke 3: ");
        c = scan.nextInt();
      }
    }
    System.out.println("====================================");

    total = (a * nasiG) + (b * mieG) + (c * kwetiau);

    System.out.println("Total harga yang harus dibayarkan adalah Rp " + total);
  }
}
