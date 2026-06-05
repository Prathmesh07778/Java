package Asgnpract.Conditional_Statments.Number_System_1;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
 
        int n = sc.nextInt();
 
        boolean composite = false;
 
        if (n > 1) {
 
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) { composite = true; break; }
            }
        }
 
        if (composite) System.out.println(n + " is a composite number.");
 
        else System.out.println(n + " is not a composite number.");
    }
}