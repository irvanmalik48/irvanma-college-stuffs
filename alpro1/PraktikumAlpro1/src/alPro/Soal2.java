package alPro;

import java.util.Scanner;

public class Soal2 
{
	public static void main(String args[])
	{
		int nilaiAlPro1, nilaiFisika, nilaiAgama, nilaiRataRata, stepOne;
		Scanner scan = new Scanner(System.in);
		System.out.println("Menentukan Rata-Rata Nilai 3 Pelajaran");
		System.out.println();
		
		System.out.print("Masukkan nilai Algoritma dan Pemograman 1: ");
		nilaiAlPro1 = scan.nextInt();
		while (nilaiAlPro1 < 0 || nilaiAlPro1 > 100)
		{
		    System.out.println("Harap masukkan input nilai dengan rentang 0 - 100.");
		    nilaiAlPro1 = scan.nextInt();
		}
		
		System.out.print("Masukkan nilai Fisika: ");
		nilaiFisika = scan.nextInt();
		while (nilaiFisika < 0 || nilaiFisika > 100)
		{
		    System.out.println("Harap masukkan input nilai dengan rentang 0 - 100.");
		    nilaiFisika = scan.nextInt();
		}
		
		System.out.print("Masukkan nilai Agama: ");
		nilaiAgama = scan.nextInt();
		while (nilaiAgama < 0 || nilaiAgama > 100)
		{
		    System.out.println("Harap masukkan input nilai dengan rentang 0 - 100.");
		    nilaiAgama = scan.nextInt();
		}
		
		stepOne = nilaiAlPro1 + nilaiFisika + nilaiAgama;
		nilaiRataRata = stepOne / 3;
		
		System.out.println();
		System.out.println("Nilai rata-rata dari ketiga pelajaran adalah: " +nilaiRataRata);
	}
}
