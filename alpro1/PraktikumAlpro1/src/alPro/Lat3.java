// Nama : Irvan Malik Azantha
// NIM : 09021282025060
// Mata Kuliah : Praktikum Algoritma dan Pemrograman 1
// Kelas : Reguler 1 B

package alPro;

import java.util.Scanner;

public class Lat3 
{
	public static void main(String args[])
	{
		int jumlahHari = 0;
		int tahun;
		String bulan = "";
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Masukkan nama bulan: ");
		bulan = scan.nextLine();
		
		System.out.print("Masukkan tahun: ");
		tahun = scan.nextInt();
		
		switch (bulan)
		{
			case "Januari" : case "Maret" : case "Mei" : case "Juli" : case "Agustus" : case "Oktober" : case "Desember" :
			case "januari" : case "maret" : case "mei" : case "juli" : case "agustus" : case "oktober" : case "desember" :
			case "1" : case "3" : case "5" : case "7" : case "8" : case "10" : case "12" :
				jumlahHari = 31;
				break;
			case "April" : case "Juni" : case "September" : case "November" :
			case "april" : case "juni" : case "september" : case "november" :
			case "4" : case "6" : case "9" : case "11" :
				jumlahHari = 30;
				break;
			case "Februari" : case "februari" : case "2" :
				if ((tahun % 400 == 0) || ((tahun % 100 != 0) && (tahun % 4 == 0)))
				{
					jumlahHari = 29;
				}
				else
				{
					jumlahHari = 28;
				}
				break;
		}
		System.out.println("Jumlah hari pada bulan " +bulan+ " adalah " +jumlahHari+ " hari");
	}
}
