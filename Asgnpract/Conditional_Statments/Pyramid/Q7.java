package Asgnpract.Conditional_Statments.Pyramid;


import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int even = 2;

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j < i; j++) System.out.print("    ");

            for (int j = 1; j <= (2 * (n - i) + 1); j++) {

                System.out.printf("%-4d", even);
                even += 2;
            }

            System.out.println();
        }
    }
}