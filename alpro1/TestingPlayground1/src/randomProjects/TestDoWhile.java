package randomProjects;

import java.util.Scanner;

public class TestDoWhile
{
	public static void main(String args[])
	{
		String id, pw;
		Scanner scan = new Scanner(System.in);
		
		do
		{
			id = scan.nextLine();
			pw = scan.nextLine();
		}
		while(id == "admin" && pw == "admin");
	}
}
