package Asgnpract.Conditional_Statments.Diamond;

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
 
        int n = sc.nextInt();
 
        for (int i = 1; i <= n; i++) {
 
            for (int j = i; j < n; j++) System.out.print("  ");
 
            for (int j = 1; j <= (2 * i - 1); j++) {
 
                char c = (char)('A' + Math.min(j, 2 * i - j) - 1);
 
                System.out.print(c + " ");
            }
 
            System.out.println();
        }
 
        for (int i = n - 1; i >= 1; i--) {
 
            for (int j = i; j < n; j++) System.out.print("  ");
 
            for (int j = 1; j <= (2 * i - 1); j++) {
 
                char c = (char)('A' + Math.min(j, 2 * i - j) - 1);
 
                System.out.print(c + " ");
            }
 
            System.out.println();
        }
    }
}
