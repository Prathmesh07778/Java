package Asgnpract.Conditional_Statments.Space_Triangle_Pattern;

//  Number increasing-then-decreasing
// Rows=3: 1  2  3
//            2  3
//               3
// (same column count decreasing from left)

import java.util.Scanner;

class P8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows: ");

        int n = sc.nextInt();

        for(int i = 1; i <= n; i++) {

            for(int s = 1; s < i; s++)
                System.out.print("  ");

            for(int j = i; j <= n; j++)
                System.out.print(j + " ");

            System.out.println();
        }
    }
}
