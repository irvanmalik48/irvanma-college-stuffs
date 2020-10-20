package alPro;

import java.util.*;

public class Soal4
{
	public static void main(String args[])
	{
		long jumlahUang, duaPuluhLima, limaPuluh, seRatus, limaRatus, seRibu;
		long duaPuluhLimaCfg, limaPuluhCfg, seRatusCfg, limaRatusCfg, seRibuCfg;
		Scanner scan = new Scanner(System.in);
		System.out.println("Menentukan Nilai Tukaran Pecahan Uang");
		
		System.out.println("Masukkan jumlah uang dalam kelipatan 25 :");
		jumlahUang = scan.nextLong();
		
		seRibu = jumlahUang / 1000;
		seRibuCfg = jumlahUang % 1000;
		limaRatus = seRibuCfg / 500;
		limaRatusCfg = seRibuCfg % 500;
		seRatus = limaRatusCfg / 100;
		seRatusCfg = limaRatusCfg % 100;
		limaPuluh = seRatusCfg / 50;
		limaPuluhCfg = seRatusCfg % 50;
		duaPuluhLima = limaPuluhCfg / 25;
		duaPuluhLimaCfg = limaPuluhCfg % 25;

		System.out.println();
		
			System.out.println("Hasil konversi keseluruhan :");
			System.out.println(seRibu+ " pecahan uang bernilai Rp1000");
			System.out.println(limaRatus+ " pecahan uang bernilai Rp500");
			System.out.println(seRatus+ " pecahan uang bernilai Rp100");
			System.out.println(limaPuluh+ " pecahan uang bernilai Rp50");
			System.out.println(duaPuluhLima+ " pecahan uang bernilai Rp25");
	}
}
