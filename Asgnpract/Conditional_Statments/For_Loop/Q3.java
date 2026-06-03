package Asgnpract.Conditional_Statments.For_Loop;

// First N 3-digit numbers

import java.util.Scanner;

class L3 {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
 
        System.out.print("Enter N: ");
        int n = sc.nextInt();
 
        for(int i = 100; i < 100 + n; i++)
            System.out.print(i + " ");
    }
}