package algoritmaPemrograman;

import java.util.Scanner;

public class Soal1 {

  public static void main(String args[]) {
    char a;
    Scanner scan = new Scanner(System.in);

    System.out.print("Masukkan huruf: ");
    a = scan.next().charAt(0);

    if (a == 'A' || a == 'I' || a == 'U' || a == 'E' || a == 'O') {
      System.out.println("Huruf adalah huruf vokal");
    } else if (a == 'a' || a == 'i' || a == 'u' || a == 'e' || a == 'o') {
      System.out.println("Huruf adalah huruf vokal");
    } else {
      System.out.println("Huruf bukan huruf vokal");
    }
  }
}
