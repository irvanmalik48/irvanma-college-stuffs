package randomProjects;

import java.util.Scanner;

public class TestFor
{
	public static Scanner scan = new Scanner(System.in);
	public static char choose;
	
	public static void main(String args[])
	{
		int i, x;
		
		System.out.println("LOOP HITUNG");
		System.out.print("Hitung sampai: ");
		x = scan.nextInt();
		
		for (i = 1 ; i <= x ; i++)
		{
			System.out.println(i);
		}
		
		System.out.println();
		System.out.println("Continue? (Y/N)");
		choose = scan.next().charAt(0);
		
		switch (choose)
		{
			case 'Y' : case 'y' :
				System.out.println();
				second(null);
				break;
			case 'N' : case 'n' :
				System.exit(0);
				break;
		}
	}
	
	public static void second(String args[])
	{
		int i, j, k, l, x;
		
		System.out.println("SEGITIGA BINTANG");
		System.out.print("Masukkan kolom: ");
		x = scan.nextInt();
		
		for (i = 1; i <= x; i++)
		{
	           for (j = x - 1; j >= i; j--)
	           {
	               System.out.print(' ');
	           }
	           for (k = 1; k <= i; k++)
	           {
	               System.out.print('*');
	           }
	           for (l = 1; l <= i - 1; l++)
	           {
	               System.out.print('*');
	           }
	           System.out.println(" ");
		}
		
		System.out.println();
		System.out.println("Continue? (Y/N)");
		choose = scan.next().charAt(0);
		
		switch (choose)
		{
			case 'Y' : case 'y' :
				System.out.println();
				third(null);
				break;
			case 'N' : case 'n' :
				System.exit(0);
				break;
		}
	}
	
	public static void third(String args[])
	{
		int a = 5, b = 7, c, d;
		for(c = 1; c <= a; c++)
		{
			for(d = 1; d <= b; d++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
