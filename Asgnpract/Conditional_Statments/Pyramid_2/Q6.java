package Asgnpract.Conditional_Statments.Pyramid_2;

import java.util.Scanner;

// Pattern (n=3):
//       3
//     2 2 2
//   1 1 1 1 1
// Top row = n, bottom row = 1

public class Q6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Number of rows: ");

        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            int val = n - i + 1;

            for (int s = 0; s < n - i; s++) System.out.print("  ");

            for (int j = 0; j < (2 * i - 1); j++) System.out.print(val + " ");

            System.out.println();
        }

        sc.close();
    }
}