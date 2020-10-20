package alPro;

import java.util.*;

public class Latihan3 
{
	public static final int SUBSTRACT_VALUE = 100;
	public static final double PERCENTAGE = 0.1;
	
	public static void main(String args[]) 
	{
		float bodyHeight, step1, idealWeight, step2;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Menghitung berat ideal");
		System.out.println("Masukkan tinggi badan: ");
		bodyHeight = scan.nextInt();
		
		step1 = bodyHeight - SUBSTRACT_VALUE;
		step2 = step1 * (float) PERCENTAGE;
		idealWeight = step1 - step2;
		
		System.out.println("Berat badan ideal: " +idealWeight+ " kg");
	}
}