package Asgnpract.Conditional_Statments.Pyramid;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int num = 1;

        for (int i = 1; i <= n; i++) {

            for (int j = i; j < n; j++) System.out.print("   ");

            for (int j = 1; j <= (2 * i - 1); j++) {

                System.out.print(num + " ");
                num += 2;
            }

            System.out.println();
        }
    }
}