package javaProj;

import java.util.Arrays;
import java.util.Scanner;

public class SearchArray {

  static void count(char[] arr, int n) {
    boolean v[] = new boolean[n];
    Arrays.fill(v, false);
    for (int i = 0; i < n; i++) {
      if (v[i] == true) continue;
      int count = 1;
      for (int j = i + 1; j < n; j++) if (arr[i] == arr[j]) {
        v[j] = true;
        count++;
      }
      System.out.printf("\n%c\t : %d", arr[i], count);
    }
  }

  public static void main(String[] args) {
    String str;
    char[] arr;
    Scanner scan = new Scanner(System.in);
    str = scan.nextLine();
    arr = new char[str.length()];
    for (int i = 0; i < str.length(); i++) arr[i] = str.charAt(i);
    count(arr, arr.length);
    scan.close();
  }
}
