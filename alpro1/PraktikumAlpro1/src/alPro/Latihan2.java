package alPro;

import java.util.*;

public class Latihan2 {

  public static void main(String args[]) {
    int x, y, z, a;
    Scanner scan = new Scanner(System.in);

    System.out.println("Mempertukarkan tripel (x, y, z) menjadi (y, z, x)");
    System.out.println("Masukkan angka x");
    x = scan.nextInt();
    System.out.println("Masukkan angka y");
    y = scan.nextInt();
    System.out.println("Masukkan angka z");
    z = scan.nextInt();
    System.out.println(
      "Maka (x, y, z) adalah (" + x + ", " + y + ", " + z + ")"
    );

    // Pertukaran nilai
    a = x;
    x = y;
    y = z;
    z = x;

    System.out.println(
      "Dan jika diubah menjadi (y, z, x) hasilnya adalah (" +
      x +
      ", " +
      y +
      ", " +
      z +
      ")"
    );
  }
}
