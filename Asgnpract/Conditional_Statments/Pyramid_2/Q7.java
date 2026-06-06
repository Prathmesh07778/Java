package Asgnpract.Conditional_Statments.Pyramid_2;

import java.util.Scanner;

// Pattern (n=3):
//       C
//     B C B
//   A B C B A

public class Q7 {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
 
        System.out.print("Number of rows: ");
 
        int n = sc.nextInt();
 
        for (int i = 1; i <= n; i++) {
 
            char maxCh = (char) ('A' + i - 1);
 
            for (int s = 0; s < n - i; s++) System.out.print("  ");
 
            // descending letters before peak
 
            for (char c = (char)(maxCh - 1); c >= 'A'; c--) System.out.print(c + " ");
 
            System.out.print(maxCh + " ");
 
            // descending letters after peak
 
            for (char c = (char)(maxCh - 1); c >= 'A'; c--) System.out.print(c + " ");
 
            System.out.println();
 
        }
 
        sc.close();
    }
}
