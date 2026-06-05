package Asgnpract.Conditional_Statments.Number_System_2;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int start = sc.nextInt();
        int end = sc.nextInt();

        for (int num = start; num <= end; num++) {

            int temp = num;
            int sum = 0;

            while (temp > 0) {
                sum += temp % 10;
                temp /= 10;
            }

            if (sum != 0 && num % sum == 0) {
                System.out.print(num + " ");
            }
        }
    }
}