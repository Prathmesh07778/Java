package Asgnpract.Conditional_Statments.Diamond_2;

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
 
        int n = sc.nextInt();
 
        for (int i = 1; i <= n; i++) {
 
            for (int j = i; j < n; j++) System.out.print("  ");
 
            for (int j = 1; j <= (2 * i - 1); j++) {
 
                char c = (j % 2 == 0) ? (char)('A' + i - 2) : (char)('A' + i - 1);
 
                System.out.print(c + " ");
            }
 
            System.out.println();
        }
 
        for (int i = n - 1; i >= 1; i--) {
 
            for (int j = i; j < n; j++) System.out.print("  ");
 
            for (int j = 1; j <= (2 * i - 1); j++) {
 
                char c = (j % 2 == 0) ? (char)('A' + i - 2) : (char)('A' + i - 1);
 
                System.out.print(c + " ");
            }
 
            System.out.println();
        }
    }
}
