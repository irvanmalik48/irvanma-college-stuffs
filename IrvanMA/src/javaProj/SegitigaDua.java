package javaProj;

import java.util.Scanner;

public class SegitigaDua extends Segitiga {

  public static void main(String[] args) {
    int a;
    Scanner s = new Scanner(System.in);
    System.out.print("a = ");
    a = s.nextInt();
    Segitiga t = new Segitiga();
    t.segitiga(a);
  }
}
