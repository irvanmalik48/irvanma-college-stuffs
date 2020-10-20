package randomProjects;

import java.util.Scanner;

public class SoalLatihan1 
{
	
	public static void main(String args[])
	{
		String str;
		String str1;
		int x;
		int jumlah = 0;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Masukkan input :");
		str = scan.nextLine();
		
		if (str.contains("."))
		{
			str1 = str.substring(0, str.indexOf('.'));
		
			System.out.println("Input yang anda masukkan adalah : " + str1);
		
			for (x = 0 ; x < str1.length() ; x++)
			{
				jumlah++;
			}
		}
		else
		{
			System.out.println("Input yang anda masukkan adalah : " + str);
		
			for (x = 0 ; x < str.length() ; x++)
			{
				jumlah++;
			}
		}
		
		System.out.println("Jumlah karakter yang ada pada input : " +jumlah);
	}
}
