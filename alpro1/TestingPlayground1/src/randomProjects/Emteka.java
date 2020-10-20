package randomProjects;

import java.util.Scanner;

public class Emteka 
{
	public static void main(String args[])
	{
		int a, b, c, d, hasil1 = 0, hasil2 = 0, hasilAkhir = 0;
		String operator, anu = "";
		Scanner scan = new Scanner(System.in);
		
		do
		{
			System.out.println("Masukkan pembilang P1: ");
			a = scan.nextInt();
			System.out.println("Masukkan penyebut P1: ");
			b = scan.nextInt();
			System.out.println("Masukkan pembilang P2: ");
			c = scan.nextInt();
			System.out.println("Masukkan penyebut P2: ");
			d = scan.nextInt();
		
			System.out.println("P1 adalah: " + a + "/" + b);
			System.out.println("P2 adalah: " + c + "/" + d);
			System.out.println();
		
			System.out.println("DAFTAR OPERASI");
			System.out.println("Penjumlahan (+) = (P1+P2)");
			System.out.println("Pengurangan (-) = (P1-P2)");
			System.out.println("Perkalian (*) = (P1*P2)");
			System.out.println("Pembagian (/) = (P1/P2)");
			
			System.out.println("Pilih operasi: ");
			operator = scan.next();
			
			switch (operator)
			{
				case "+" :
					anu = "penjumlahan";
					if (b == d)
					{
						hasil1 = a + c;
						hasil2 = b;
					}
					else
					{
						hasil1 = (a * d) + (c * b);
						hasil2 = b * d;
					}
					break;
				case "-" :
					anu = "pengurangan";
					if (b == d)
					{
						hasil1 = a - c;
						hasil2 = b;
					}
					else
					{
						hasil1 = (a * d) - (c * b);
						hasil2 = b * d;
					}
					break;
				case "*" :
					hasil1 = a * c;
					hasil2 = b * d;
					anu = "perkalian";
					break;
				case "/" :
					hasil1 = a * d;
					hasil2 = b * c;
					anu = "pembagian";
					break;
			}
			
			hasilAkhir = hasil1 / hasil2;
			
			System.out.println("Hasil dari " + anu + " kedua pecahan adalah " + hasil1 + "/" + hasil2);
		}
		while (hasilAkhir >= 1);
	}
}
