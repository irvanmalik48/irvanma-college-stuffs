package javaProj;

import java.io.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class RandomizeScan {

  public static void main(String[] args) {
    try {
      String[] arr;
      int n, m, o = 1;
      String filename = "Susunan Kelompok";
      Scanner s = new Scanner(System.in);

      System.out.print("Total murid: ");
      n = s.nextInt();
      arr = new String[n];

      System.out.print("Total kelompok: ");
      m = s.nextInt();

      System.out.println("Inputkan nama murid: ");
      for (int i = 0; i < n; i++) {
        arr[i] = s.nextLine();
      }

      Collections.shuffle(Arrays.asList(arr));
      System.out.print("Nama file: ");
      filename = s.nextLine();

      File file = new File(filename + ".txt");
      if (!file.exists()) {
        file.createNewFile();
      }

      FileWriter fw = new FileWriter(file.getAbsoluteFile());
      BufferedWriter bw = new BufferedWriter(fw);

      for (int i = 0; i < arr.length; i++) {
        if (i == 0) {
          bw.write("Kelompok " + o + "\r\n");
          o++;
        }
        bw.write(arr[i] + "\r\n");
        if ((i + 1) % m == 0) {
          bw.write("\r\n");
          bw.write("Kelompok " + o + "\r\n");
          o++;
        }
      }

      bw.close();
      s.close();
      System.out.println("Done!");
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
