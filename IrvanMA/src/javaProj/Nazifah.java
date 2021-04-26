package javaProj;

import java.util.Scanner;

public class Nazifah {

  /**
   *  Fungsi ini untuk mengecek persenan diskon sesuai umur.
   *  Jika umur sesuai dengan salah satu kondisi maka fungsi
   *  akan mengembalikan persenan sesuai dengan yang diminta
   *  pada soal.
   */
  static double check(int umur) {
    if (umur < 30) return 0.1; else if (
      umur >= 30 && umur < 60
    ) return 0.2; else return 0.3;
  }

  public static void main(String[] args) {
    /**
     *  Deklarasi variabel
     */
    Scanner scan = new Scanner(System.in);
    double total, diskon;
    int umur;
    char kartu;

    /**
     *  Proses input dimulai dengan urutan
     *  1. Harga Total (double)
     *  2. Umur (integer)
     *  3. Kartu Member (y/n)
     */
    total = scan.nextDouble();
    umur = scan.nextInt();
    kartu = scan.next().charAt(0);

    /**
     *  Proses aritmatika untuk menghitung
     *  harga setelah diskon
     */
    diskon = total - (total * check(umur));

    /**
     *  Jika mempunyai kartu member, maka
     *  harga setelah diskon dihitung lagi
     *  untuk penambahan diskon 10% sesuai
     *  soal
     */
    if (kartu == 'y') diskon = diskon - (diskon * 0.1);

    /**
     *  Output hasil ke terminal
     */
    System.out.printf("%.2f", diskon);
  }
}
