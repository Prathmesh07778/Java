package Asgnpract.Conditional_Statments.Number_System_2;

import java.util.HashSet;
import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
 
        System.out.print("Input: ");
 
        int n = sc.nextInt();
 
        if (isHappy(n)) {
 
            System.out.println("Output: " + n + " is a happy number");
        } else {
 
            System.out.println("Output: " + n + " is not a happy number");
        }
 
        sc.close();
    }

    static boolean isHappy(int n) {
 
        HashSet<Integer> seen = new HashSet<>();
 
        while (n != 1) {
 
            if (seen.contains(n)) return false;
 
            seen.add(n);
 
            int sum = 0;
 
            while (n > 0) {
 
                int d = n % 10;
                sum += d * d;
                n /= 10;
            }
            n = sum;
        }
 
        return true;
    }
}
