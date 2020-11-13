package javaProj;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.io.*;

public class Randomize {
    public static void main(String[] args) {
        try {
            String[] arr = {
                "Ahmad Hanif", "Aini Nabilah", "Alif Toriq Alkausar", "Anwaripasha Akbar", "Arjuna Reynaldi",
                "Bayu Daru Pangestu", "Bulan Fitri Dahlan", "Damar Fadhil Muhammad", "Delia Tri Gustini",
                "Dini Putri Utami", "Elwina", "Fadhil Zahran Muwafa", "Fathur Achmad Hanafi", "Fransiska Kristina Setyawan",
                "Hania Salsabila", "Harisatul Aulia", "Ichiro Gabriel Rivaldo Simbolon", "Irvan Malik Azantha",
                "Lastri Rahelita Panjaitan", "M. Bintang Khadafi", "M. Farhan Ghifari", "Miftahul Jannah",
                "Muhammad Aulia Nugraha", "Muhammad Rafi Akbar", "Muhammad Rizky Akbar", "Muhammad Syafiq Al Fatih",
                "Muhammad Yuansheva Firmansyah", "Nadya Andriani Puspita Sari", "Nadya Angelia", "Rizka Gusnaini",
                "Sheva Satrian", "Taveto Simangunsong", "Yolanda Marevin"
            };
            int m, o = 1;
            String filename = "Susunan Kelompok";
            Scanner s = new Scanner(System.in);

            Collections.shuffle(Arrays.asList(arr));
            System.out.print("Nama file: ");
            filename = s.nextLine();

            File file = new File(filename + ".txt");
            if (!file.exists()) {
                file.createNewFile();
            }

            System.out.print("Jumlah 1 kelompok: ");
            m = s.nextInt();

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

            System.out.println("Done!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
