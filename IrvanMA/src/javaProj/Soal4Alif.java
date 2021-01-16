package javaProj;

import java.util.Scanner;

public class Soal4Alif {
    public static void konversi(int a) {
		int jutaan, ratusanRibu, puluhanRibu, ribuan, ratusan ,puluhan, satuan, sisaMiliaran, sisaJutaan, sisaRatusanRibu, sisaPuluhanRibu, sisaRibuan, SisaRatusan;
		
		jutaan = a/1000000;
		sisaJutaan = a%1000000;
		ratusanRibu = sisaJutaan/100000;
		sisaRatusanRibu = sisaJutaan%100000;
		puluhanRibu = sisaRatusanRibu/10000;
		sisaPuluhanRibu = sisaRatusanRibu%10000;
		ribuan = sisaPuluhanRibu/1000;
		sisaRibuan = sisaPuluhanRibu%1000;
		ratusan = sisaRibuan/100;
		SisaRatusan = sisaRibuan%100;
		puluhan = SisaRatusan/10;
		satuan = SisaRatusan%10;
		
		System.out.println(jutaan + " " + ratusanRibu + " " + puluhanRibu + " " + ribuan + " " + ratusan + " " + puluhan + " " + satuan);
		
		String b[] = { "", "se", "dua ", "tiga ", "empat ", "lima ", "enam ", "tujuh ", "delapan ", "sembilan "};
		
		if(a<10000000) {
			if(jutaan>0) {
				System.out.print(b[jutaan]+"juta ");
			}
			if(ratusanRibu>0) {
				System.out.print(b[ratusanRibu]+"ratus ");
			}
			if(puluhanRibu==1) {
				System.out.print(b[ribuan]+"belas ribu ");
			}
			else if(puluhanRibu>0) {
				System.out.print(b[puluhanRibu]+"puluh ");
			}
			if(puluhanRibu==1) {
				System.out.print("");
			}
			else if(ribuan>0) {
				System.out.print(b[ribuan]+"ribu ");
			}
			if (ratusan>0) {
				System.out.print(b[ratusan]+"ratus ");
			}
			if (puluhan==1) {
				System.out.print(b[satuan]+"belas ");
			}
			else if(puluhan>1) {
				System.out.print(b[puluhan]+"puluh ");
			}
			if(puluhan==1) {
				System.out.print("");
			}
			else if (satuan>0) {
				System.out.print(b[satuan]);
			}
		}
		else {
			System.out.println("= = Angka Maks. Pada Program Ini Hanya 9.999.999 = =");
		}
		
		
	}
	
	 public static void main(String[] args) {
	        Scanner s = new Scanner (System.in);
	        
	        System.out.println("Konversi angka (Maks. 9.999.999)");
	        
	        System.out.print("Masukan Bilangan Angka : ");
	        int bilangan = s.nextInt();
	        
	        konversi(bilangan);
	        
	 }
}
