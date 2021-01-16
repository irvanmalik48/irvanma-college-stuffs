package javaProj.Mod2;

import java.util.Scanner;

public class Soal2 {
    static void next(String day, String[] nextDay) {
        switch (day.toLowerCase()) {
            case "senin":
                nextDay[0] = "selasa";
                break;
            case "selasa":
                nextDay[0] = "rabu";
                break;
            case "rabu":
                nextDay[0] = "kamis";
                break;
            case "kamis":
                nextDay[0] = "jumat";
                break;
            case "jumat":
                nextDay[0] = "sabtu";
                break;
            case "sabtu":
                nextDay[0] = "minggu";
                break;
            case "minggu":
                nextDay[0] = "senin";
                break;
        }
    }
    
    public static void main(String[] args) {
        String day;
        String[] nextDay = {""};
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Masukkan nama hari: ");
        day = scan.next();

        next(day, nextDay);
        System.out.printf("%s", nextDay[0]);
    }
}
