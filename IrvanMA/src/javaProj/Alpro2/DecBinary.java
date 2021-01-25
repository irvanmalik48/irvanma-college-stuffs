package javaProj.Alpro2;

import java.util.Scanner;

public class DecBinary {
    static String convert(int x) {
        int a;
        String bin = "";
        char c[] = {'0', '1'};
        while (x > 0) {
            a = x % 2;
            bin = c[a] + bin;
            x = x / 2;
        }
        return bin;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x;
        System.out.print("Enter decimal: ");
        x = scan.nextInt();
        System.out.printf("Hexadecimal: %s", convert(x));
    }
}
