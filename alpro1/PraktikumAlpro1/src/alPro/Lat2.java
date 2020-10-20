// Nama : Irvan Malik Azantha
// NIM : 09021282025060
// Mata Kuliah : Praktikum Algoritma dan Pemrograman 1
// Kelas : Reguler 1 B

package alPro;

import java.util.Scanner;

public class Lat2 
{
	public static void main(String args[])
	{
		int a, b;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Masukkan angka A: ");
		a = scan.nextInt();
		
		System.out.print("Masukkan angka B: ");
		b = scan.nextInt();
		
		if (a == b)
		{
			System.out.println("Seri");
		}
		else if (a < b && b % 2 == 0 || a > b && a % 2 == 0)
		{
			System.out.println("Genap");
		}
		else 
		{
			System.out.println("Ganjil");
		}
	}
}
