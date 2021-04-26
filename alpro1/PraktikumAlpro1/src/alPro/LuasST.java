package alPro;

import java.util.Scanner;

public class LuasST {

  public static void main(String args[]) {
    float alas; //	Alas segitiga
    float tinggi; //	Tinggi segitiga
    float divide = 2; //	Pembagi
    float luas = 0.0f; //	Luas segitiga
    Scanner scanNum = new Scanner(System.in); //	Scanner

    /**	Kenapa saya memakai float?
     * 	Karena jika menggunakan integer biasa, akan terdapat keterbatasan
     * 	yaitu tidak bisa mengalikan bilangan desimal.
     */

    System.out.println("Menghitung Luas Segitiga");
    System.out.println(); // Blank line

    /**	Yang ada dibawah adalah kode scanner untuk input angka yang akan
     * 	menjadi value dari variabel-variabel perkalian.
     */

    System.out.println("Masukkan alas:");
    alas = scanNum.nextFloat();
    System.out.println("Masukkan tinggi:");
    tinggi = scanNum.nextFloat();
    System.out.println();

    /**	Yang ada dibawah ini adalah...
     */

    luas = alas * tinggi / divide;

    System.out.println("Luas segitiga:");
    System.out.println(luas);
  }
}
