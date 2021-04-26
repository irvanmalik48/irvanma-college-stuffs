// Nama : Irvan Malik Azantha
// NIM : 09021282025060
// Mata Kuliah : Algoritma dan Pemrograman 1
// Kelas : Reguler 1 B

package quizAlpro2;

import java.util.Scanner;

public class Soal1 {

  public static void main(String args[]) {
    // Samsung
    int samsungA = 4100000; // M40
    int samsungB = 4250000; // A60
    int samsungC = 9500000; // A80
    // Oppo
    int oppoA = 3300000; // K3
    int oppoB = 3000000; // Reno
    int oppoC = 4100000; // A9X
    // Vivo
    int vivoA = 2000000; // Y3
    int vivoB = 3000000; // Y5S
    // Error
    int errorMerek = 0;
    int errorModel = 0;

    String merek, model;
    Scanner scan = new Scanner(System.in);

    System.out.println("--------------------------------");
    System.out.println("CEK HARGA HP SAMSUNG, OPPO, VIVO");
    System.out.println("--------------------------------");
    System.out.println();
    System.out.print("Masukkan merek HP: ");
    merek = scan.nextLine();
    System.out.println();

    if (merek.equalsIgnoreCase("samsung")) {
      System.out.print("Masukkan model HP: ");
      model = scan.nextLine();
      System.out.println();

      if (model.equalsIgnoreCase("m40")) {
        System.out.println("Harga: Rp. " + samsungA);
      } else if (model.equalsIgnoreCase("a60")) {
        System.out.println("Harga: Rp. " + samsungB);
      } else if (model.equalsIgnoreCase("a80")) {
        System.out.println("Harga: Rp. " + samsungC);
      } else {
        errorModel = 1;
      }
    } else if (merek.equalsIgnoreCase("oppo")) {
      System.out.print("Masukkan model HP: ");
      model = scan.nextLine();
      System.out.println();

      if (model.equalsIgnoreCase("k3")) {
        System.out.println("Harga: Rp. " + oppoA);
      } else if (model.equalsIgnoreCase("reno")) {
        System.out.println("Harga: Rp. " + oppoB);
      } else if (model.equalsIgnoreCase("a9x")) {
        System.out.println("Harga: Rp. " + oppoC);
      } else {
        errorModel = 1;
      }
    } else if (merek.equalsIgnoreCase("vivo")) {
      System.out.print("Masukkan model HP: ");
      model = scan.nextLine();
      System.out.println();

      if (model.equalsIgnoreCase("y3")) {
        System.out.println("Harga: Rp. " + vivoA);
      } else if (model.equalsIgnoreCase("y5s")) {
        System.out.println("Harga: Rp. " + vivoB);
      } else {
        errorModel = 1;
      }
    } else {
      errorMerek = 1;
    }

    if (errorMerek == 1) {
      System.out.println(
        "Error : Input merek yang anda masukkan tidak ada di database"
      );
      System.out.println("Silahkan mengulang kembali.");
      System.out.println();
      main(null);
    }

    if (errorModel == 1) {
      System.out.println(
        "Error : Input model yang anda masukkan tidak ada di database"
      );
      System.out.println("Silahkan mengulang kembali.");
      System.out.println();
      main(null);
    }
  }
}
