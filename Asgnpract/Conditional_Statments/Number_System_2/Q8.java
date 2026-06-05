package Asgnpract.Conditional_Statments.Number_System_2;

import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int start = sc.nextInt();
        int end = sc.nextInt();

        for (int num = start; num <= end; num++) {

            int temp = num;
            int digits = String.valueOf(num).length();

            int sum = 0;

            while (temp > 0) {
                int digit = temp % 10;
                sum += Math.pow(digit, digits);
                temp /= 10;
            }

            if (sum == num) {
                System.out.print(num + " ");
            }
        }
    }
}