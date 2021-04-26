package algoritmaPemrograman;

import java.util.Scanner;

public class Soal2 {

  public static void main(String args[]) {
    char a;
    Scanner scan = new Scanner(System.in);

    System.out.print("Masukkan huruf: ");
    a = scan.next().charAt(0);

    if (Character.isUpperCase(a)) {
      System.out.println("Huruf adalah huruf kapital");
    } else if (Character.isLowerCase(a)) {
      System.out.println("Huruf bukan huruf kapital");
    } else {
      System.out.println("Ini bukanlah huruf");
      System.out.println("Silahkan berikan input berupa huruf");
      System.out.println();
      main(null);
    }
  }
}
