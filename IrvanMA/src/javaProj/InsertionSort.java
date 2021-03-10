package javaProj;

import java.util.Scanner;

public class InsertionSort {
    static void sort(int[] arr) {
        int j, k;
        for (int i = 0; i < arr.length; i++) {
            j = i - 1;
            k = arr[i];
            while (j >= 0 && arr[j] > k) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = k;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n, arr[];
        n = scan.nextInt();
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        sort(arr);
        for (int i = 0; i < n; i++) {
            System.out.printf("%d ", arr[i]);
        }
        scan.close();
    }
}