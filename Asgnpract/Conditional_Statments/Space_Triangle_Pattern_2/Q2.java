package Asgnpract.Conditional_Statments.Space_Triangle_Pattern_2;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        int num = rows;

        for (int i = 1; i <= rows; i++) {

            // spaces
            for (int j = 1; j <= rows - i; j++) {
                System.out.print("  ");
            }

            // numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }

            System.out.println();
        }
    }
}
