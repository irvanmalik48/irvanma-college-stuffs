package javaProj;

public class Segitiga {

  public void segitiga(int a) {
    int c;
    for (int i = 1; i <= a; i++) {
      for (int j = 1; j <= i; j++) {
        c = 2 * j;
        System.out.print(c + " ");
      }
      System.out.print("\n");
    }
  }

  public static void main(String[] args) {}
}
