package Asgnpract.Conditional_Statments.Number_System_1;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
 
        int n = sc.nextInt();
 
        long fact = 1;
 
        for (int i = 1; i <= n; i++) fact *= i;
 
        System.out.println("A factorial of " + n + " is " + fact + ".");
    }
}