		/**	------------------------------
 		 *	Java Calculator
		 *	Made by : Irvan Malik Azantha
		 *	Date 	: 09/13/2020
		 *	------------------------------
		 */
package alPro;

import java.util.Scanner;			// Import stuffs to class

public class Kalkulator			// Defines the class
{
	public static void main(String args[])
	{
		int num1;			// First number
		int num2;			// Second number
		char op;				// Operator
		double answer = 0.0;	// So that it includes comma
		Scanner scanObject;
		scanObject = new Scanner(System.in);	/** Tried Scanner scanObject = new Scanner(System.in)
												 *	but somehow it breaks. Changing it to this
												 *	helped stuffs better.
												 */
		
		System.out.println("Simple Calculator");				// Title? Of course.
		
		System.out.println("Insert first number : ");
		num1 = scanObject.nextInt();							// Inserts first number.
		System.out.println("Insert second number : ");
		num2 = scanObject.nextInt();							// Inserts second number.
		System.out.println("Insert operation : ");
		op = scanObject.next().charAt(0);						// This one's kind of tricky.

			switch (op)			// 4 different operations to choose from.
			{
				case '+' : answer = num1 + num2;	// Add.
						break;
				case '-' : answer = num1 - num2;	// Subtract.
						break;
				case '*' : answer = num1 * num2;	// Multiply.
						break;
				case '/' : answer = num1 / num2;	// Divide.
						break;
			}
		System.out.println(num1+" "+op+" "+num2+" = "+answer);	// The final step. Shows the answer.
	}
}
