package javaProj;

import java.util.Scanner;
import java.lang.Integer;
 
public class Kalkulator {
    static Scanner scan = new Scanner(System.in);
    public void normal() {
        float a, b;
        char op;
        System.out.print("First number: ");
        a = scan.nextFloat();
        System.out.print("Second number: ");
        b = scan.nextFloat();
        System.out.print("Operator (+, -, *, /, %): ");
        op = scan.next().charAt(0);
        calculate(a, b, op);
    }

    public void hex() {
        String a;
        int b, c;
        System.out.print("Number: ");
        a = scan.next();
        System.out.print("Source base: ");
        b = scan.nextInt();
        System.out.print("Target base: ");
        c = scan.nextInt();
        System.out.print(calchex(a, b, c));
    }

    public String calchex(String a, int b, int c) {
        return Integer.toString(Integer.parseInt(a, b), c);
    }

    public void calculate(float num1, float num2, char operator) {
        float equals = 0;
        switch (operator) {
            case '+' :
                equals = num1 + num2;
                break;
            case '-' :
                equals = num1 - num2;
                break;
            case '*' :
                equals = num1 * num2;
                break;
            case '/' :
                equals = num1 / num2;
                break;
            case '%' :
                equals = num1 % num2;
                break;
        }
        System.out.printf("%.2f %c %.2f = %.2f", num1, operator, num2, equals);
    }
    
    public static void main(String[] args) {
        String a;
        System.out.print("Choose between [hex] or [normal]: ");
        a = scan.next();
        if (a.equalsIgnoreCase("normal")) {
            new Kalkulator().normal();
        }
        else if (a.equalsIgnoreCase("hex")) {
            new Kalkulator().hex();
        }
    }
}