package Asgnpract.Conditional_Statments.Diamond_2;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
 
        int n = sc.nextInt();
 
        for (int i = 1; i <= n; i++) {
            for (int j = i; j < n; j++) System.out.print("  ");
            for (int j = 1; j <= (2 * i - 1); j++) System.out.print("1 ");
 
            System.out.println();
        }
 
        for (int i = n - 1; i >= 1; i--) {

            for (int j = i; j < n; j++) System.out.print("  ");

            for (int j = 1; j <= (2 * i - 1); j++) System.out.print("1 ");

            System.out.println();
        }
    }
}
