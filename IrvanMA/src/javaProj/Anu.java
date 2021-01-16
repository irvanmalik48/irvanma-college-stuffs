package javaProj;

import java.util.Scanner;

public class Anu {
    static void result(int n, int[] num) {
        switch (n) {
            case 1:
                num[2] = 1;
                num[3] = 1;
                break;
            case 2:
                num[1] = 1;
                num[2] = 1;
                num[4] = 1;
                num[5] = 1;
                num[7] = 1;
                break;
            case 3:
                num[1] = 1;
                num[2] = 1;
                num[3] = 1;
                num[4] = 1;
                num[7] = 1;
                break; 
            case 4:
                num[2] = 1;
                num[3] = 1;
                num[6] = 1;
                num[7] = 1;
                break;
            case 5:
                num[1] = 1;
                num[3] = 1;
                num[4] = 1;
                num[6] = 1;
                num[7] = 1;
                break;
            case 6:
                num[1] = 1;
                num[3] = 1;
                num[4] = 1;
                num[5] = 1;
                num[6] = 1;
                num[7] = 1;
                break;
            case 7:
                num[1] = 1;
                num[2] = 1;
                num[3] = 1;
                break;
            case 8:
                num[1] = 1;
                num[2] = 1;
                num[3] = 1;
                num[4] = 1;
                num[5] = 1;
                num[6] = 1;
                num[7] = 1;
                break;
            case 9:
                num[1] = 1;
                num[2] = 1;
                num[3] = 1;
                num[4] = 1;
                num[6] = 1;
                num[7] = 1;
                break;
        }
    }

    public static void main(String[] args) {
        int n;
        int[] num = {0, 0, 0, 0, 0, 0, 0, 0};
        String[] res = {"", "", "", "", "", "", "", ""};
        Scanner scan = new Scanner(System.in);
        
        n = scan.nextInt();
        result(n, num);
        
        for (int i = 1; i < num.length; i++) {
            if (num[i] == 1)
                res[i] = "ON";
            else
                res[i] = "OFF";
            System.out.printf("Lampu %d : %s\n", i, res[i]);
        }
    }
}