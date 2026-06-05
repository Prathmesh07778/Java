package Asgnpract.Conditional_Statments.Number_System_1;

import java.util.Scanner;

public class Q7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();

        long orig = n;

        int sum = 0;

        while (n > 0) {

            int d = (int)(n % 10);
            if (d % 2 == 0) sum += d;
            n /= 10;
        }

        System.out.println("The sum of even numbers from " + orig + " is " + sum);
    }
}
