package Asgnpract.Conditional_Statments.Invereted_Space_Triangle;

import java.util.Scanner;

// Rows=3:   a b c
//             d e
//               f
// Rows=4:   a b c d
//             e f g
//               h i
//                 j

public class Q1 {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
 
        System.out.print("Number of rows: ");
        int n = sc.nextInt();
        char ch = 'a';
 
        for (int i = n; i >= 1; i--) {
 
            for (int s = 0; s < n - i; s++) System.out.print("  ");
 
            for (int j = 0; j < i; j++) {
 
                System.out.print(ch++ + " ");
            }
 
            System.out.println();
        }
 
        sc.close();
    }
}