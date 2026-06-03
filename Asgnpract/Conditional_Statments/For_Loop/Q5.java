package Asgnpract.Conditional_Statments.For_Loop;

// Odd numbers from 1 to N

import java.util.Scanner;

class L5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        System.out.print("Enter N: ");
        int n = sc.nextInt();
 
        for(int i = 1; i <= n; i += 2)
            System.out.print(i + " ");
    }
}
