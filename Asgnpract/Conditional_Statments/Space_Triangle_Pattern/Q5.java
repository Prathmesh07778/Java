package Asgnpract.Conditional_Statments.Space_Triangle_Pattern;

//  Square multiples triangle
// Rows=3:       1
//             2  4
//           3  6  9

import java.util.Scanner;

class Q5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows: ");

        int n = sc.nextInt();

        for(int i = 1; i <= n; i++) {

            for(int s = 0; s < n-i; s++)
                System.out.print("   ");

            for(int j = 1; j <= i; j++)
                System.out.print(i*j + " ");

            System.out.println();
        }
    }
}