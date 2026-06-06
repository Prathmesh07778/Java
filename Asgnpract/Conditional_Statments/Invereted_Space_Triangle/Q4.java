package Asgnpract.Conditional_Statments.Invereted_Space_Triangle;

import java.util.Scanner;

// Rows=3:   1  2  3
//              A  B
//                 1
// Rows=4:   1  2  3  4
//              A  B  C
//                 1  2
//                    A
// Each row: alternates between sequential numbers and letters

public class Q4 {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
 
        System.out.print("Number of rows: ");
        int n = sc.nextInt();
 
        for (int i = 0; i < n; i++) {
 
            for (int s = 0; s < i; s++) System.out.print("   ");
 
            int count = n - i;
 
            // row i: if i%3==0 → numbers, if i%3==1 → uppercase, if i%3==2 → numbers again
 
            for (int j = 0; j < count; j++) {
 
                if (i % 2 == 0) {
 
                    System.out.printf("%-3d", j + 1);
 
                } else {
 
                    System.out.printf("%-3c", (char)('A' + j));
                }
            }
 
            System.out.println();
        }
 
        sc.close();
    }
}