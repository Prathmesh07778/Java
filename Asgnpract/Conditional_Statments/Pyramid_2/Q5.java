package Asgnpract.Conditional_Statments.Pyramid_2;

import java.util.Scanner;

// Pattern (n=3):
//       1
//     B B B
//   3 3 3 3 3
// Odd rows → row number, Even rows → letter

public class Q5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Number of rows: ");

        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            for (int s = 0; s < n - i; s++) System.out.print("  ");

            String val = (i % 2 == 1) ? String.valueOf(i) : String.valueOf((char)('A' + i - 1));

            for (int j = 0; j < (2 * i - 1); j++) System.out.print(val + " ");

            System.out.println();
        }

        sc.close();
    }
}
