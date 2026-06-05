package Asgnpract.Conditional_Statments.Pyramid_2;

import java.util.Scanner;

 class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            // spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }

            char ch;

            if (i == 1) {
                ch = 'A';
            } else if (i == 2) {
                ch = 'B';
            } else if (i == 3) {
                ch = 'C';
            } else {
                ch = 'D';
            }

            // print characters
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print(ch + " ");
            }

            System.out.println();
        }

        sc.close();
    }
}