package javaProj;

import java.util.Scanner;

public class TugasIndra {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int in = 0, choose;
    char ch = '0';
    String str = "0", cant = "", cantchar = "", cantbool = "";
    byte b = 0;
    long l = 0;
    short sh = 0;
    float fp = 0;
    double d = 0;
    boolean bool = false, cat;

    System.out.print(
      "Pilihan:\nInteger (1)\nByte (2)\nShort (3)\nLong (4)\nFloat (5)\nDouble (6)\nBoolean (7)\nChar (8)\nString (9)"
    );
    System.out.print("\nPilih nomor: ");
    choose = scan.nextInt();

    switch (choose) {
      case 1:
        System.out.print("\nNilai integer: ");
        in = scan.nextInt();
        Integer temp = in;

        b = temp.byteValue();
        sh = (short) in;
        l = (long) in;
        fp = (float) in;
        d = (double) in;
        ch = (char) in;
        str = temp.toString();
        bool = (in % 2 == 1);
        break;
      case 2:
        System.out.print("\nNilai byte: ");
        b = scan.nextByte();

        in = b;
        sh = (short) b;
        l = (long) b;
        fp = (float) b;
        d = (double) b;
        ch = (char) b;
        str = Byte.toString(b);
        bool = (b % 2 == 1);
        break;
      case 3:
        System.out.print("\nNilai short: ");
        sh = scan.nextShort();

        in = sh;
        b = (byte) sh;
        l = (long) sh;
        fp = (float) sh;
        d = (double) sh;
        ch = (char) sh;
        str = Short.toString(sh);
        bool = (sh % 2 == 1);
        break;
      case 4:
        System.out.print("\nNilai long: ");
        l = scan.nextLong();
        Long tempLong = l;

        in = tempLong.intValue();
        b = tempLong.byteValue();
        sh = tempLong.shortValue();
        fp = (float) l;
        d = (double) l;
        ch = (char) l;
        str = Long.toString(l);
        bool = (l % 2 == 1);
        break;
      case 5:
        System.out.print("\nNilai float: ");
        fp = scan.nextFloat();
        Float tempFloat = fp;

        in = (int) fp;
        b = tempFloat.byteValue();
        sh = tempFloat.shortValue();
        l = (long) fp;
        d = (double) fp;
        ch = (char) fp;
        str = Float.toString(fp);
        bool = (fp % 2 == 1);
        break;
      case 6:
        System.out.print("\nNilai double: ");
        d = scan.nextDouble();
        Double tempDouble = d;

        in = (int) d;
        b = tempDouble.byteValue();
        sh = tempDouble.shortValue();
        l = (long) d;
        fp = tempDouble.floatValue();
        ch = (char) d;
        str = Double.toString(d);
        bool = (d % 2 == 1);
        break;
      case 7:
        System.out.print("\nNilai boolean: ");
        bool = scan.nextBoolean();

        in = (bool) ? 1 : 0;
        b = (bool) ? (byte) 1 : (byte) 0;
        sh = (bool) ? (short) 1 : (short) 0;
        l = (bool) ? 1 : 0;
        fp = (bool) ? 1 : 0;
        ch = (bool) ? '1' : '0';
        str = (bool) ? "True" : "False";
        d = (bool) ? 1.0 : 0.0;
        break;
      case 8:
        System.out.print("\nNilai char: ");
        ch = scan.next().charAt(0);

        in = (int) ch;
        b = (byte) ch;
        sh = (short) ch;
        l = (long) ch;
        fp = (float) ch;
        d = (double) ch;
        str = Character.toString(ch);
        bool = (((int) ch) % 2 == 1);
        break;
      case 9:
        System.out.print("\nNilai string: ");
        str = scan.next();

        cat = false;

        try {
          Integer.parseInt(str);
        } catch (NumberFormatException e) {
          cat = true;
          in = 0;
          b = 0;
          sh = 0;
          l = 0;
          fp = 0;
          d = 0;
          cant = "(can't parse to data type)";
          cantchar = "(string too long)";
          cantbool = "(string is not bool value)";
        }

        if (cat == false) {
          in = Integer.parseInt(str);
          b = Byte.parseByte(str);
          sh = Short.parseShort(str);
          l = Long.parseLong(str);
          fp = Float.parseFloat(str);
          d = Double.parseDouble(str);
        }

        if (str.length() == 1) {
          ch = str.charAt(0);
        } else {
          ch = '0';
        }
        if (cat == false) {
          bool = (in % 2 == 1);
        } else if (str.equalsIgnoreCase("true")) {
          bool = true;
          cantbool = "";
        } else if (str.equalsIgnoreCase("false")) {
          bool = false;
          cantbool = "";
        } else {
          bool = false;
        }
        break;
    }
    System.out.print("Integer: " + in + " " + cant);
    System.out.print("\nLong: " + l + " " + cant);
    System.out.print("\nShort: " + sh + " " + cant);
    System.out.print("\nByte: " + b + " " + cant);
    System.out.print("\nFloat: " + fp + " " + cant);
    System.out.print("\nDouble: " + d + " " + cant);
    System.out.print("\nString: " + str);
    System.out.print("\nChar: " + ch + " " + cantchar);
    System.out.print("\nBoolean: " + bool + " " + cantbool);
  }
}
