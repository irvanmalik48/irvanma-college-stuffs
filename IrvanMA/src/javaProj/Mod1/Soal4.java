/** Nama : Irvan Malik Azantha
 *  NIM : 09021282025060
 *  Kelas : TI 1 Reguler B
 *  Mata Kuliah : Praktikum Pemrograman dan Algoritma 1
*/

package javaProj.Mod1;

import java.util.Scanner;

public class Soal4 {
    static String translate(int n) {
        String a = "Input tidak valid.";
        String[] huruf = {"", "satu", "dua", "tiga", "empat", "lima", "enam", "tujuh", "delapan", "sembilan", "sepuluh", "sebelas"};
        if (n <= 11) 
            return huruf[n];
        else if (n > 11 && n <= 19) 
            return huruf[n % 10] + " belas ";
        else if (n > 19 && n <= 99)
            return translate(n / 10) + " puluh " + huruf[n % 10];
        else if (n > 99 && n <= 199)
            return "seratus " + translate(n % 100);
        else if (n > 199 && n <= 999)
            return translate(n / 100) + " ratus " + translate(n % 100);
        else if (n > 999 && n <= 1999)
            return "seribu " + translate(n % 1000);
        else if (n > 1999 && n <= 999999)
            return translate(n / 1000) + " ribu " + translate(n % 1000);
        else if (n > 999999 && n <= 1999999)
            return "sejuta " + translate(n % 1000000);
        else if (n > 1999999 && n <= 999999999)
            return translate(n / 1000000) + " juta " + translate(n % 1000000);
        else if (n > 999999999 && n <= Integer.MAX_VALUE)
            return translate(n / 1000000000) + " milyar " + translate(n % 1000000000);
        else
            return a;
    }

    public static void main(String[] args) {
        int n;
        String m;
        Scanner scan = new Scanner(System.in);
        System.out.print("Perhatian: Batas maksimal input = 2147483647\n");
        System.out.print("Masukan: ");
        n = scan.nextInt();
        m = translate(n);
        System.out.print("Luaran: " + m);
    }
}
