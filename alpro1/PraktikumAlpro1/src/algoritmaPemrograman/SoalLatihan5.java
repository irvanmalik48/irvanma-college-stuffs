package algoritmaPemrograman;

public class SoalLatihan5 {

  public static void main(String args[]) {
    int a = 25;
    int hasil;
    int x, y, z;

    for (x = 0; x <= a; x++) {
      for (y = 0; y <= a; y++) {
        for (z = 0; z <= a; z++) {
          hasil = x + y + z;
          if (hasil == 25) {
            System.out.println("x = " + x + ", y = " + y + ", z = " + z);
          }
        }
      }
    }
  }
}
