package Asgnpract.Conditional_Statments.Pyramid_2;

import java.util.Scanner;

// Pattern (n=3):
//       3
//     3 2 3
//   3 2 1 2 3

public class Q4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Number of rows: ");

        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            int val = n - i + 1;

            for (int s = 0; s < n - i; s++) System.out.print("  ");

            for (int j = val; j >= 1; j--) System.out.print(j + " ");

            for (int j = 2; j <= val; j++) System.out.print(j + " ");

            System.out.println();

        }

        sc.close();
    }
}