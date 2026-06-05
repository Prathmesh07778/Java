package Asgnpract.Conditional_Statments.Number_System_1;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
 
        long n = sc.nextLong();
 
        int sum = 0;
 
        while (n > 0) { sum += n % 10; n /= 10; }
 
        System.out.println(sum);
    }
}
