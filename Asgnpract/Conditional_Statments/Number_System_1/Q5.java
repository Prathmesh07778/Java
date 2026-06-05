package Asgnpract.Conditional_Statments.Number_System_1;

import java.util.Scanner;

public class Q5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();

        while (n > 0) {

            System.out.print(n % 10 + " ");

            n /= 10;
        }
    }
}