package Asgnpract.Conditional_Statments.Invereted_Space_Triangle;

import java.util.Scanner;

// Rows=3:    3   6   9
//                2   4
//                    1
// Rows=4:    4   8  12  16
//                3   6   9
//                    2   4
//                        1
// Row i (1-indexed): multiples of (n-i+1) from col 1 to (n-i+1)

public class Q9 {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
 
        System.out.print("Number of rows: ");
        int n = sc.nextInt();
 
        for (int i = 0; i < n; i++) {
 
            for (int s = 0; s < i; s++) System.out.print("    ");
 
            int multiplier = n - i;
 
            for (int j = 1; j <= n - i; j++) {
 
                System.out.printf("%-4d", j * multiplier);
 
            }
 
            System.out.println();
        }
 
        sc.close();
    }
}
