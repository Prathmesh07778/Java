package Asgnpract.Conditional_Statments.Diamond;


import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            for (int j = i; j < n; j++) System.out.print("  ");

            for (int j = 1; j <= (2 * i - 1); j++) {

                System.out.print(Math.min(j, 2 * i - j) + " ");
            }

            System.out.println();
        }

        for (int i = n - 1; i >= 1; i--) {

            for (int j = i; j < n; j++) System.out.print("  ");

            for (int j = 1; j <= (2 * i - 1); j++) {

                System.out.print(Math.min(j, 2 * i - j) + " ");
            }

            System.out.println();
        }
    }
}
