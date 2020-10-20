package alPro;

import java.util.*;

public class Latihan1
{
	public static void main(String args[])
	{
		long detik, menit, jam, hari;
		long detikConfig, menitConfig, jamConfig, hariConfig;
		long menit1, jam1, hari1;
		Scanner scan = new Scanner(System.in);
		System.out.println("Mengubah detik menjadi satuan waktu lain");
		
		System.out.println("Masukkan jumlah detik");
		detik = scan.nextLong();
		
		// konversi keseluruhan
		hari = detik / 86400;
		hariConfig = detik % 86400;
		jam = hariConfig / 3600;
		jamConfig = hariConfig % 3600;
		menit = jamConfig / 60;
		menitConfig = jamConfig % 60;
		detikConfig = menitConfig / 1;
		
		// konversi per satuan
		hari1 = detik / 86400;
		jam1 = detik / 3600;
		menit1 = detik / 60;
		
		System.out.println("");
		
			System.out.println("Hasil konversi keseluruhan :");
			System.out.println(hari+ " hari");
			System.out.println(jam+ " jam");
			System.out.println(menit+ " menit");
			System.out.println(detikConfig+ " detik");
		
		System.out.println("");
		
			System.out.println("Hasil konversi per satuan :");
			System.out.println(hari1+ " hari");
			System.out.println(jam1+ " jam");
			System.out.println(menit1+ " menit");
			System.out.println(detik+ " detik");
	}
}
