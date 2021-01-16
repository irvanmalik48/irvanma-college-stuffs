package javaProj.Mod2;

import java.util.Scanner;

public class Soal1 {
    static int hitung(int jam, int menit, int detik) {
        detik = detik + (menit * 60) + (jam * 3600);
        return detik;
    }

    static int jam_ke_detik(int jam) {
        jam *= 3600;
        return jam;
    }

    static int menit_ke_detik(int menit) {
        menit *= 60;
        return menit;
    }
    
    public static void main(String[] args) {
        int jam, menit, detik;
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah jam: ");
        jam = scan.nextInt();
        System.out.print("Masukkan jumlah menit: ");
        menit = scan.nextInt();
        System.out.print("Masukkan jumlah detik: ");
        detik = scan.nextInt();

        System.out.printf("\nTotal jumlah detik: %d detik", hitung(jam, menit, detik));
        System.out.print("\nKonversi ke satuan detik:");
        System.out.printf("\n%d jam = %d detik", jam, jam_ke_detik(jam));
        System.out.printf("\n%d menit = %d detik", menit, menit_ke_detik(menit));
        System.out.printf("\n%d detik = %d detik", detik, detik);
    }
}
