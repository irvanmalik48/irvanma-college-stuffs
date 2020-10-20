// Nama : Irvan Malik Azantha
// NIM : 09021282025060
// Mata Kuliah : Praktikum Algoritma dan Pemrograman 1
// Kelas : Reguler 1 B

package alPro;

public class Quiz1
{
	public static void main(String args[]) 
	{
       int x = 6;
       for (int i = 1; i <= x; i++)			// outer for layer
       {
           for (int j = 5; j >= i; j--)		// inner for layer, yg ini untuk jumlah spasi per kolom, menentukan baris
           {
               System.out.print(' ');
           }
           for (int k = 1; k <= i; k++)		// untuk mengisi
           {
               System.out.print('*');
           }
           for (int l = 1; l <= i - 1; l++)
           {
               System.out.print('*');
           }
           System.out.println(" ");
       }
	}
}