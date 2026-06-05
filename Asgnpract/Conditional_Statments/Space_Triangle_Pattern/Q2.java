package Asgnpract.Conditional_Statments.Space_Triangle_Pattern;

//  Alphabet right triangle (A B C / B C / C)
// Rows=3:    C
//          B C
//        A B C

import java.util.Scanner;

class Q3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows: ");

        int n = sc.nextInt();

        for(int i = 1; i <= n; i++) {

            for(int s = 0; s < n-i; s++)
                System.out.print("  ");

            for(int j = n-i; j < n; j++)
                System.out.print((char)('A' + j) + " ");

            System.out.println();
        }
    }
}