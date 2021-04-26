package javaProj;

public class FibonacciGenap {

  public static void main(String[] args) {
    int a = 0, b = 1, c = 0, hasil = 0;
    System.out.println(a);
    for (int i = 2; i < 1000; i += c) {
      c = a + b;
      a = b;
      b = c;
      if (c % 2 == 0) {
        hasil += c;
      }
      System.out.println(c);
    }
    System.out.print("\n" + hasil);
  }
}
