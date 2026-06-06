package Asgnpract.Conditional_Statments.Pyramid_2;

import java.util.Scanner;

// Pattern (n=3):
//         1
//       1 3 1
//     1 3 5 3 1

public class Q8  {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
 
        System.out.print("Number of rows: ");
 
        int n = sc.nextInt();
 
        for (int i = 1; i <= n; i++) {
 
            for (int s = 0; s < n - i; s++) System.out.print("  ");
 
            // ascending odd numbers: 1, 3, 5, ... (2i-1)
 
            for (int j = 1; j <= 2 * i - 1; j += 2) System.out.print(j + " ");
 
            // descending odd numbers: (2i-3), ... 1
 
            for (int j = 2 * i - 3; j >= 1; j -= 2) System.out.print(j + " ");
 
            System.out.println();
 
        }
 
        sc.close();
    }
}