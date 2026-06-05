package Asgnpract.Conditional_Statments.Invereted_Triangle;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        // Total chars = n*(n+1)/2, last char index

        int total = n * (n + 1) / 2;

        int idx = total - 1;

        for (int i = n; i >= 1; i--) {

            for (int j = 0; j < i; j++) {

                char c = (char)('A' + idx - j);

                System.out.print(c + " ");

            }

            idx -= i;

            System.out.println();
        }
    }
}
