package javaProj;

import java.util.Arrays;
import java.util.Scanner;

public class CodeG {

  static int check(int[] arr, int B) {
    int counter = 0, temp = 0;
    Arrays.sort(arr);
    for (int i = 0; i < arr.length; i++) {
      if (temp >= B) break; else temp += arr[i];
      counter++;
    }
    return counter;
  }

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int tc, B, N, arr[], x[], y[];
    tc = scan.nextInt();
    x = new int[tc];
    y = new int[tc];
    for (int i = 0; i < tc; i++) {
      x[i] = i + 1;
      N = scan.nextInt();
      B = scan.nextInt();
      arr = new int[N];
      for (int j = 0; j < N; j++) arr[j] = scan.nextInt();
      y[i] = check(arr, B);
    }
    for (int i = 0; i < tc; i++) System.out.printf("\n#%d: %d", x[i], y[i]);
  }
}
