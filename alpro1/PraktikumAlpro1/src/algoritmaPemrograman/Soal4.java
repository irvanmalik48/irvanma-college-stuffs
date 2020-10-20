package algoritmaPemrograman;

import java.util.Scanner;

public class Soal4
{
	public static void main(String args[])
	{
		int nilaiMahasiswa;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Masukkan nilai mahasiswa : ");
		nilaiMahasiswa = scan.nextInt();
		
		if (nilaiMahasiswa > 80 && nilaiMahasiswa <= 100)
		{
			System.out.println("Nilai mahasiswa adalah A");
		}
		else if (nilaiMahasiswa > 70 && nilaiMahasiswa <= 80)
		{
			System.out.println("Nilai mahasiswa adalah B");
		}
		else if (nilaiMahasiswa > 55 && nilaiMahasiswa <= 70)
		{
			System.out.println("Nilai mahasiswa adalah C");
		}
		else if (nilaiMahasiswa > 40 && nilaiMahasiswa <= 55)
		{
			System.out.println("Nilai mahasiswa adalah D");
		}
		else if (nilaiMahasiswa > 0 && nilaiMahasiswa <= 40)
		{
			System.out.println("Nilai mahasiswa adalah E");
		}
		else
		{
			System.out.println("Nilai mahasiswa tidak valid");
			System.out.println("Silahkan berikan input nilai antara 0 - 100");
			System.out.println();
			main(null);
		}
	}
}
