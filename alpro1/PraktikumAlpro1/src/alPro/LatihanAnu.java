package alPro;

import java.util.Scanner;

public class LatihanAnu
{
	public static void main(String args[])
	{
		float panjang;
		float lebar;
		float luas;
		Scanner scanNum = new Scanner(System.in);
		
		System.out.println("Menghitung Luas Persegi Panjang");
			System.out.println();
		
		System.out.println("Masukkan panjang:");
		panjang = scanNum.nextFloat();
		System.out.println("Masukkan lebar:");
		lebar = scanNum.nextFloat();
			System.out.println();
		
		luas = panjang * lebar;
		
		System.out.println("Luas persegi panjang:");
		System.out.println(luas);
	}
}
