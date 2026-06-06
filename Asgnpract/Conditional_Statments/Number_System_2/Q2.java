package Asgnpract.Conditional_Statments.Number_System_2;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
 
        System.out.print("Enter start: ");
        int start = sc.nextInt();
 
        System.out.print("Enter end: ");
        int end = sc.nextInt();
 
        System.out.print("Output: ");
 
        for (int i = start; i <= end; i++) {
 
            if (isDeficient(i)) System.out.print(i + " ");
 
        }
 
        System.out.println();
        sc.close();
    }

    static boolean isDeficient(int n) {
 
        if (n < 1) return false;
 
        int sum = 0;
 
        for (int i = 1; i < n; i++) {
 
            if (n % i == 0) sum += i;
 
        }
 
        return sum < n;
    }
}
