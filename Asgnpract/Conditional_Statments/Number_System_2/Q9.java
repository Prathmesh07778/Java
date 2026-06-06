package Asgnpract.Conditional_Statments.Number_System_2;

import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
 
        System.out.print("Input: ");
        int n = sc.nextInt();
        long square = (long) n * n;
 
        String numStr = String.valueOf(n);
        String sqStr = String.valueOf(square);
 
        if (sqStr.endsWith(numStr)) {
 
            System.out.println("Output: " + n + " is Automorphic");
        } else {
 
            System.out.println("Output: " + n + " is Not Automorphic");
        }
 
        sc.close();
    }
}
