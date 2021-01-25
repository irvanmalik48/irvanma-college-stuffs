package javaProj.Alpro2;

import java.util.Scanner;

public class DecHex {
    static String convert(int x) {
        int a;
        String hex = "";
        char c[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        while (x > 0) {
            a = x % 16;
            hex = c[a] + hex;
            x = x / 16;
        }
        return hex;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x;
        System.out.print("Enter decimal: ");
        x = scan.nextInt();
        System.out.printf("Hexadecimal: %s", convert(x));
    }
}
