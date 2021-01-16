package javaProj;

import java.util.Base64;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

class EraserThread implements Runnable {
    private boolean stop;

    public EraserThread(String prompt) {
        System.out.print(prompt);
    }
    
    public void run () {
        stop = true;
        while (stop) {
          System.out.print("\010 ");
        try {
            Thread.currentThread();
            Thread.sleep(1);
            } catch (InterruptedException ie) {
                ie.printStackTrace();
            }
        }
    }
    
    public void stopMasking() {
        this.stop = false;
    }
 }

public class LoginTask {
    static String readPassword(String prompt) {
        EraserThread et = new EraserThread(prompt);
        Thread mask = new Thread(et);
        mask.start();

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String password = "";

        try {
            password = in.readLine();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        et.stopMasking();
        return password;
    }

    static void proc(String uname, String pw, String choose) {
        String encodeUname, encodePw, encodeAll;
        if (choose.equals("Register")) {
            try {
                File file = new File("data.db");
                FileWriter fw = new FileWriter(file, true);
                encodeUname = Base64.getEncoder().encodeToString(uname.getBytes());
                encodePw = Base64.getEncoder().encodeToString(pw.getBytes());
                encodeAll = encodeUname + " " + encodePw + "\n";

                fw.write(encodeAll);
                fw.close();

                System.out.printf("Successful.\nPlease login to continue.\n");
                main(null);
            } catch (Exception e) {
                System.out.print("\n" + e);
            }
        } else if (choose.equals("Login")) {
            try {
                BufferedReader br = new BufferedReader(new FileReader("data.db"));
                encodeUname = Base64.getEncoder().encodeToString(uname.getBytes());
                encodePw = Base64.getEncoder().encodeToString(pw.getBytes());
                encodeAll = encodeUname + " " + encodePw;
                
                String rl = br.readLine();
                while (rl != null) {
                    if (rl.equals(encodeAll)) {
                        br.close();
                        System.out.printf("Successfully login as <%s>.", uname);
                        break;
                    } else {
                        rl = br.readLine();
                    }
                }
            } catch (Exception e) {
                System.out.print("\n" + e);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char bool = '*';
        String uname, pw, choose = "";
        
        while (bool != '0' && bool != '1') {
            System.out.print("Register (0) or Login (1)? ");
            bool = scan.next().charAt(0);
            if (bool == '0') {
                choose = "Register";
            } else if (bool == '1') {
                choose = "Login";
            } else System.out.print("Please give a valid input.");
        }

        System.out.print("Username: ");
        uname = scan.next();
        System.out.print("Password: ");
        pw = readPassword("");

        proc(uname, pw, choose);

        scan.close();
    }
}