package javaProj;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Hmm {

  static void convert(String a, char[] temp, String[] rand, String[] b) {
    b[0] = "" + a.charAt(0);

    for (int i = 0; i < a.length(); i++) temp[i] = a.charAt(i);

    for (int i = 0; i < (a.length() - 2); i++) rand[i] = "" + temp[i + 1];

    Collections.shuffle(Arrays.asList(rand));

    for (String i : rand) if (i != null) b[0] = b[0] + i;

    b[0] = b[0] + a.charAt(a.length() - 1);
  }

  static void convert(String a, char[] temp, String[] rand, String[] b, int x) {
    temp = new char[a.length()];
    rand = new String[a.length() - 2];

    b[x] = "" + a.charAt(0);

    for (int i = 0; i < a.length(); i++) temp[i] = a.charAt(i);

    for (int i = 0; i < (a.length() - 2); i++) rand[i] = "" + temp[i + 1];

    Collections.shuffle(Arrays.asList(rand));

    for (String i : rand) {
      if (i != null/* && i != "0" */) b[x] = b[x] + i;
    }

    b[x] = b[x] + a.charAt(a.length() - 1);
  }

  public static void main(String[] args) {
    String a, d = "";
    String[] splitted;
    String[] b = { "" };
    char[] temp = { '0' };
    String[] rand = { "" };
    Scanner scan = new Scanner(System.in);

    System.out.print("Masukkan input: ");
    a = scan.nextLine();
    splitted = a.split(" ");

    if (a.contains(" ")) {
      b = new String[splitted.length];
      for (int i = 0; i < splitted.length; i++) {
        convert(splitted[i], temp, rand, b, i);
      }
      for (String i : b) d = d + " " + i;
      System.out.printf("Output: %s\n", d);
    } else {
      b = new String[a.length()];
      convert(a, temp, rand, b);
      System.out.printf("Output: %s\n", b[0]);
    }

    scan.close();
  }
}
