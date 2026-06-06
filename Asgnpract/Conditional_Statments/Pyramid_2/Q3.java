package Asgnpract.Conditional_Statments.Pyramid_2;

import java.util.Scanner;

// Pattern (n=3):
//       1
//     1 2 1
//   1 2 3 2 1

public class Q3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Number of rows: ");

        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            for (int s = 0; s < n - i; s++) System.out.print("  ");

            for (int j = 1; j <= i; j++) System.out.print(j + " ");

            for (int j = i - 1; j >= 1; j--) System.out.print(j + " ");

            System.out.println();

        }

        sc.close();
    }
}
