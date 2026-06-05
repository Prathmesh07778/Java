package Asgnpract.Conditional_Statments.Number_System_1;

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
 
        long n = sc.nextLong();
 
        long orig = n, rev = 0;
 
        while (n > 0) { rev = rev * 10 + n % 10; n /= 10; }
 
        if (orig == rev) System.out.println(orig + " is a palindrome number.");
 
        else System.out.println(orig + " is not a palindrome number.");
    }
}
