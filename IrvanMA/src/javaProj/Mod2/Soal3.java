package javaProj.Mod2;

import java.util.Scanner;

public class Soal3 {
    static double sqrt(int d) {
        double temp;
        double squareRoot = d / 2;
        do {
            temp = squareRoot;
            squareRoot = (temp + (d / temp)) / 2;
        } while ((temp - squareRoot) != 0);
        return squareRoot;
    }

    static double calculate(int x1, int x2, int y1, int y2) {
        int a = (x1 - x2) * (x1 - x2);
        int b = (y1 - y2) * (y1 - y2);
        int c = a + b;
        double d;
        if (c == 0)
            return 0.0;
        else {
            d = sqrt(c);
            return d;
        }
    }

    public static void main(String[] args) {
        int x1, x2, y1, y2;
        Scanner scan = new Scanner(System.in);

        System.out.print("x1 = ");
        x1 = scan.nextInt();
        System.out.print("y1 = ");
        y1 = scan.nextInt();
        System.out.print("x2 = ");
        x2 = scan.nextInt();
        System.out.print("y2 = ");
        y2 = scan.nextInt();

        System.out.printf("d = %f", calculate(x1, x2, y1, y2));
    }
}
