package javaProj;

import java.util.Scanner;

public class Nomor2 {
    static void output(char[][] x, int n, int m) {
        int counter[][] = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i == 0 && j == 0) {
                    if (x[i][j] == '*')
                        x[i][j] = '#';
                    else {
                        for (int k = 0; k <= i + 1; k++) {
                            for (int l = 0; l <= j + 1; l++) {
                                if (x[k][l] == '#') {
                                    counter[i][j]++;
                                }
                                x[i][j] += counter[i][j];
                            }
                        }
                    }
                }
                if (i == n - 1 && j == m - 1) {
                    if (x[i][j] == '*')
                        x[i][j] = '#';
                    else {
                        for (int k = n - 1; k >= n - 2; k--) {
                            for (int l = m - 1; l >= m - 2; l--) {
                                if (x[k][l] == '#') {
                                    counter[i][j]++;
                                }
                                x[i][j] += counter[i][j];
                            }
                        }  
                    }
                }
                if (i == n - 1 && j == 0) {
                    if (x[i][j] == '*')
                        x[i][j] = '#';
                    else {
                        for (int k = n - 1; k >= n - 2; k--) {
                            for (int l = 0; l <= j; l++) {
                                if (x[k][l] == '#') {
                                    counter[i][j]++;
                                }
                                x[i][j] += counter[i][j];
                            }
                        }  
                    }
                }
                if (i == 0 && j == m - 1) {
                    if (x[i][j] == '*')
                        x[i][j] = '#';
                    else {
                        for (int k = 0; k <= i + 1; k--) {
                            for (int l = m - 1; l >= m - 2; l++) {
                                if (x[k][l] == '#') {
                                    counter[i][j]++;
                                }
                                x[i][j] += counter[i][j];
                            }
                        }  
                    }
                }
                if (i != 0 && i != n - 1 && j == 0) {
                    if (x[i][j] == '*')
                        x[i][j] = '#';
                    else {
                        for (int k = i - 1; k <= i + 1; k++) {
                            for (int l = j; l <= j + 1; l++) {
                                if (x[k][l] == '#') {
                                    counter[i][j]++;
                                }
                                x[i][j] += counter[i][j];
                            }
                        }  
                    }
                }
                if (i != 0 && i != n - 1 && j == m - 1) {
                    if (x[i][j] == '*')
                        x[i][j] = '#';
                    else {
                        for (int k = i - 1; k <= i + 1; k++) {
                            for (int l = j; l >= j - 1; l--) {
                                if (x[k][l] == '#') {
                                    counter[i][j]++;
                                }
                                x[i][j] += counter[i][j];
                            }
                        }  
                    }
                }
                if (j != 0 && j != m - 1 && i == 0) {
                    if (x[i][j] == '*')
                        x[i][j] = '#';
                    else {
                        for (int k = i; k <= i + 1; k++) {
                            for (int l = j - 1; l <= j + 1; l++) {
                                if (x[k][l] == '#') {
                                    counter[i][j]++;
                                }
                                x[i][j] += counter[i][j];
                            }
                        }  
                    }
                }
                if (i == n - 1 && j != 0 && j != m - 1) {
                    if (x[i][j] == '*')
                        x[i][j] = '#';
                    else {
                        for (int k = i; k >= i - 1; k--) {
                            for (int l = j - 1; l <= j + 1; l++) {
                                if (x[k][l] == '#') {
                                    counter[i][j]++;
                                }
                                x[i][j] += counter[i][j];
                            }
                        }  
                    }
                }
                if (i > 0 && j > 0 && i < n - 1 && j < m - 1) {
                    if (x[i][j] == '*')
                        x[i][j] = '#';
                    else {
                        for (int k = i - 1; k >= i + 1; k++) {
                            for (int l = j - 1; l <= j + 1; l++) {
                                if (x[k][l] == '#') {
                                    counter[i][j]++;
                                }
                                x[i][j] += counter[i][j];
                            }
                        }  
                    }
                }
            }
        }
    }
    
    public static void main(String[] args) {
        char[][] x;
        int n, m;
        String a;
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        m = scan.nextInt();
        x = new char[n][m];

        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++) {
                a = scan.next();
                x[i][j] = a.charAt(0);
            }
        
        output(x, n, m);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++)
                System.out.print(x[i][j]);
            System.out.print("\n");
        }
    }
}
