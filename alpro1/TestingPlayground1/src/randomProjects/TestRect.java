package randomProjects;

public class TestRect
{
	public static void main(String args[])
	{
		int x, y;
		int n = 5;
		int m = 0;
		for (x = 0 ; x < n ; x++)
		{
			m += 1;
			for (y = 0 ; y < m ; y++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
