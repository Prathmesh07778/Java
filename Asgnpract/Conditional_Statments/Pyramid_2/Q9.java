package Asgnpract.Conditional_Statments.Pyramid_2;

import java.util.Scanner;

// Pattern (n=3):
//              2
//          3   5   7
//    11  13  17  19  23

public class Q9 {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
 
        System.out.print("Number of rows: ");
 
        int n = sc.nextInt();

        // Pre-generate enough primes
 
        int[] primes = new int[500];
 
        int found = 0, num = 2;
 
        while (found < 500) {
 
            if (isPrime(num)) primes[found++] = num;
               num++;
        }
        
        int idx = 0;
        
        for (int i = 1; i <= n; i++) {
        
            int cols = 2 * i - 1;
        
            for (int s = 0; s < n - i; s++) System.out.print("     ");
        
            for (int j = 0; j < cols; j++) {
        
                System.out.printf("%-6d", primes[idx++]);
        
            }
        
            System.out.println();
        }
        
        sc.close();
    }

    static boolean isPrime(int n) {
        
        if (n < 2) return false;
        
        for (int i = 2; i * i <= n; i++) {
        
            if (n % i == 0) return false;
        
        }
        
        return true;
    }
}
