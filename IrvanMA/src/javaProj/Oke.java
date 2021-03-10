package javaProj;

import java.util.Arrays;
import java.util.Scanner;

public class Oke {
    static int calculate(int x[]) {
        int mean = 0;
        for (int i = 0; i < x.length; i++) {
            mean += x[i];
        }
        mean /= x.length;
        return mean;
    }

    static void check(int x, int mean, int i) {
        if (x > mean) 
            System.out.printf("nilai index %d: %d lebih besar dari rata-rata\n", i + 1, x);
        else if (x == mean) 
            System.out.printf("nilai index %d: %d sama dengan rata-rata\n", i + 1, x);
        else 
            System.out.printf("nilai index %d: %d kurang dari rata-rata\n", i + 1, x);
    }

    public static void main(String[] args) {
        int x[] = new int[1];
        int counter = 0, temp = 0, mean;
        Scanner scan = new Scanner(System.in);

        while (temp >= 0) {
            x[counter] = scan.nextInt();
            temp = x[counter];
            counter++;
            x = Arrays.copyOf(x, (counter + 1));
        }
        x = Arrays.copyOf(x, x.length - 2);

        mean = calculate(x);
        System.out.printf("rata-rata: %d\n", mean);
        
        for (int i = 0; i < x.length; i++) {
            check(x[i], mean, i);
        }
    }
}