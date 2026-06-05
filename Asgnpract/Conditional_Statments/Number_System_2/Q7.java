package Asgnpract.Conditional_Statments.Number_System_2;

import java.util.Scanner;

public class Q7 {
    
    static int factorial(int n) {
        int fact = 1;

        for (int i = 1; i <= n; i++) {
            fact *= i;
        }

        return fact;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int start = sc.nextInt();
        int end = sc.nextInt();

        for (int num = start; num <= end; num++) {

            int temp = num;
            int sum = 0;

            while (temp > 0) {
                int digit = temp % 10;
                sum += factorial(digit);
                temp /= 10;
            }

            if (sum == num) {
                System.out.print(num + " ");
            }
        }
    }
}