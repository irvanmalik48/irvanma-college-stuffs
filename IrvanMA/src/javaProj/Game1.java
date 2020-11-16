package javaProj;

import java.util.Scanner;

public class Game1 {
    static int rng(int min, int max) {
        return ((int) (Math.random() * (max - min))) + min;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a, b, c, d, jawaban;
        int benar = 0;
        int salah = 0;
        int min = 0; 
        int max = 500;
        System.out.print("JAWABLAH SOAL-SOAL BERIKUT!\n");
        for (int i = 1; i <= 50; i++) {
            if (i >= 1 && i <= 10) {
                a = rng(min, max);
                b = rng(min, max);
                System.out.print(i + ". " + a + " + " + b + " = ");
                jawaban = scan.nextInt();
                if (a + b == jawaban) {
                    System.out.println("Benar");
                    benar++;
                }
                else {
                    System.out.println("Salah");
                    salah++;
                }
            }
            else if (i >= 11 && i <= 20) {
                a = rng(min, max);
                b = rng(min, max);
                System.out.print(i + ". " + a + " - " + b + " = ");
                jawaban = scan.nextInt();
                if (a - b == jawaban) {
                    System.out.println("Benar");
                    benar++;
                }
                else {
                    System.out.println("Salah");
                    salah++;
                }
            }
            else if (i >= 21 && i <= 30) {
                a = rng(min, max);
                b = rng(min, max);
                c = rng(min, max);
                System.out.print(i + ". " + a + " + " + b + " + " + c + " = ");
                jawaban = scan.nextInt();
                if (a + b + c == jawaban) {
                    System.out.println("Benar");
                    benar++;
                }
                else {
                    System.out.println("Salah");
                    salah++;
                }
            }
            else if (i >= 31 && i <= 40) {
                a = rng(min, max);
                b = rng(min, max);
                c = rng(min, max);
                System.out.print(i + ". " + a + " + " + b + " - " + c + " = ");
                jawaban = scan.nextInt();
                if (a + b - c == jawaban) {
                    System.out.println("Benar");
                    benar++;
                }
                else {
                    System.out.println("Salah");
                    salah++;
                }
            }
            else if (i >= 41 && i <= 50) {
                a = rng(min, max);
                b = rng(min, max);
                c = rng(min, max);
                d = rng(min, max);
                System.out.print(i + ". " + a + " + " + b + " - " + c + " + " + d + " = ");
                jawaban = scan.nextInt();
                if (a + b - c + d == jawaban) {
                    System.out.println("Benar");
                    benar++;
                }
                else {
                    System.out.println("Salah");
                    salah++;
                }
            }
        }
    }
}
