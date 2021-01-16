package javaProj.Misc;

import java.util.Scanner;

public class Soal1 {
    static void calculate(int p, int l, String pilihan, int[] persegi) {
        if (pilihan.equalsIgnoreCase("luas")) {
            persegi[0] = p * l;
        }
        else if (pilihan.equalsIgnoreCase("keliling")) {
            persegi[0] = 2 * (p + l);
        }
    }

    static void calculate(float r, String pilihan, float[] lingkaran) {
        if (pilihan.equalsIgnoreCase("luas")) {
            lingkaran[0] = 3.14f * r * r;
        }
        else if (pilihan.equalsIgnoreCase("keliling")) {
            lingkaran[0] = 3.14f * (r + r);
        }
    }

    public static void main(String[] args) {
        int p, l;
        float r;
        int[] persegi = {0};
        float[] lingkaran = {0};
        String pilihan, cek;
        Scanner scan = new Scanner(System.in);

        System.out.print("Masukkan bentuk benda: ");
        cek = scan.nextLine();
        System.out.print("Masukkan pilihan: ");
        pilihan = scan.next();

        if (cek.equalsIgnoreCase("persegi panjang")) {
            System.out.print("Masukkan panjang: ");
            p = scan.nextInt();
            System.out.print("Masukkan lebar: ");
            l = scan.nextInt();
            calculate(p, l, pilihan, persegi);
            System.out.printf("Hasil dari %s persegi panjang adalah: %d", pilihan, persegi[0]);            
        }
        else if (cek.equalsIgnoreCase("lingkaran")) {
            System.out.print("Masukkan r: ");
            r = scan.nextFloat();
            calculate(r, pilihan, lingkaran);
            System.out.printf("Hasil dari %s lingkaran adalah: %.2f", pilihan, lingkaran[0]);
        }
    }
}
