package Asgnpract.Conditional_Statments.Invereted_Space_Triangle;

import java.util.Scanner;

// Rows=3:   1  B  3
//              B  3
//                 3
// Rows=4:   1  B  3  D
//              B  3  D
//                 3  D
//                    D
// Col 1: numbers (1,3,5,...odd or col index)
// Col 2: uppercase B fixed
// Col 3: number 3 fixed
// Col 4: uppercase D fixed
// Pattern: col i uses number if odd position, letter if even position

public class Q2 {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
 
        System.out.print("Number of rows: ");
        int n = sc.nextInt();
 
        for (int i = 1; i <= n; i++) {
 
            for (int s = 0; s < i - 1; s++) System.out.print("   ");
 
            for (int j = i; j <= n; j++) {
 
                // column j: odd index→number, even index→letter
 
                if (j % 2 == 1) {
 
                    System.out.printf("%-3d", j);
 
                } else {
 
                    System.out.printf("%-3c", (char)('A' + j - 1));
                }
 
            }
 
            System.out.println();
        }
 
        sc.close();
    }
}
