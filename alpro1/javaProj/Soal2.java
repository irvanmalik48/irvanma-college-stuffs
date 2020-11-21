/** Nama : Irvan Malik Azantha
 *  NIM : 09021282025060
 *  Kelas : TI 1 Reguler B
 *  Mata Kuliah : Praktikum Pemrograman dan Algoritma 1
*/

package javaProj;

import java.util.Scanner;

public class Soal2 {
    static float calculate(float n, float x) {
        x += n;
        return x;
    }

    static float next_step(float x, float counter) {
        float mean;
        mean = x / counter;
        return mean;
    }
    
    public static void main(String[] args) {
        float n = 0;
        float x = 0;
        float counter = 0;
        Scanner scan = new Scanner(System.in);
        while (n < 9999) {
            System.out.print("Masukkan N: ");
            n = scan.nextInt();
            x = calculate(n, x);
            counter++;
        }
        System.out.printf("\nHasil: %.2f", next_step(x, counter));
    }
}
