package Asgnpract.Conditional_Statments.Invereted_Space_Triangle;

import java.util.Scanner;

// Rows=3:    9  8  7
//               6  5
//                  4
// Rows=4:   16 15 14 13
//              12 11 10
//                  9  8
//                     7
// Start from n*n down to some value, row by row

public class Q6 {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
 
        System.out.print("Number of rows: ");
 
        int n = sc.nextInt();
        int num = n * n;
 
        for (int i = 0; i < n; i++) {
 
            for (int s = 0; s < i; s++) System.out.print("    ");
 
            for (int j = 0; j < n - i; j++) {
 
                System.out.printf("%-4d", num--);
 
            }
 
            System.out.println();
        }
 
        sc.close();
    }
}