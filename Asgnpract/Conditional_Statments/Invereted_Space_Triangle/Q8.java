package Asgnpract.Conditional_Statments.Invereted_Space_Triangle;


import java.util.Scanner;

// Rows=3:   64  7  36
//               5  16
//                   9
// Rows=4:  100  9  64   7
//               6  25   4
// Pattern: col0=n^2 squares descending, col1=odd numbers descending,
//          col2=squares, col3=odd numbers...

public class Q8 {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
 
        System.out.print("Number of rows: ");
        int n = sc.nextInt();
 
        // Row i (0-indexed): starts at column i, goes to column n-1
        // Even columns: (n-col)^2, Odd columns: (2*(n-col)-1)
 
        for (int i = 0; i < n; i++) {
 
            for (int s = 0; s < i; s++) System.out.print("     ");
 
            for (int j = i; j < n; j++) {
 
                int val;
 
                if (j % 2 == 0) val = (n - j) * (n - j);
 
                else             val = 2 * (n - j) - 1;
 
                System.out.printf("%-5d", val);
            }
 
            System.out.println();
        }
 
        sc.close();
    }
}