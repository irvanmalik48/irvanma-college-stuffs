/** Nama : Irvan Malik Azantha
 *  NIM : 09021282025060
 *  Kelas : TI 1 Reguler B
 *  Mata Kuliah : Praktikum Pemrograman dan Algoritma 1
*/

package javaProj;

import java.util.Scanner;

public class Soal3 {
    static int process(int n, int temp) {
        if (n < temp)
            return n;
        else
            return temp;
    }
    public static void main(String[] args) {
        int n = 0, m = 0, temp = 9999;
        Scanner scan = new Scanner(System.in);
        while (n < 9999) {
            System.out.print("Masukkan nilai N: ");
            n = scan.nextInt();
            m = process(n, temp);
            temp = m;
        }
        System.out.printf("\nNilai terkecil: %d", m);
    }
}
