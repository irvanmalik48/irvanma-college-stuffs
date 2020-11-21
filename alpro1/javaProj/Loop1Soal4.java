package javaProj;

import java.util.Scanner;

public class Loop1Soal4 {
    static void bintang(int a) {
        for (int i = 1; i <= a; i++) {
            for (int j = a; j > i; j--)
                System.out.print("!");
            for (int j = 1; j <= i; j++)
                System.out.print("*");
            System.out.print("\n");
        }
    }

    public static void main(String[] args) {
        int n;
        Scanner scan = new Scanner(System.in);
        System.out.print("TUGAS PERULANGAN 1 KELAS 1 REG B\nSOAL NOMOR 4\n");
        System.out.print("Masukkan N: ");
        n = scan.nextInt();
        bintang(n);
    }
}