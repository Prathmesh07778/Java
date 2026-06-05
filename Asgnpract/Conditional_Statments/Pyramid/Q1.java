package Asgnpract.Conditional_Statments.Pyramid;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            for (int j = i; j < n; j++) System.out.print(" ");

            for (int j = 0; j < (2 * i - 1); j++) {
                char c = (i % 2 == 1) ? (char)('A' + j) : (char)('a' + j);
                System.out.print(c);
            }

            System.out.println();
        }
    }
}