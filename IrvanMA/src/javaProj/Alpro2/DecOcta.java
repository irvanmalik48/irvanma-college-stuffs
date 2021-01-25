package javaProj.Alpro2;

import java.util.Scanner;

public class DecOcta {
    static String convert(int x) {
        int a;
        String oct = "";
        char c[] = {'0', '1', '2', '3', '4', '5', '6', '7'};
        while (x > 0) {
            a = x % 8;
            oct = c[a] + oct;
            x = x / 8;
        }
        return oct;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x;
        System.out.print("Enter decimal: ");
        x = scan.nextInt();
        System.out.printf("Octal: %s", convert(x));
    }
}
