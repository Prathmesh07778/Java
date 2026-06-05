package Asgnpract.Conditional_Statments.Invereted_Triangle;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int start = n * (n + 1); // largest even start

        for (int i = n; i >= 1; i--) {

            int val = start;

            for (int j = 1; j <= i; j++) {

                System.out.print(val + " ");
                val -= 2;

            }

            start -= (2 * i);

            System.out.println();
        }
    }
}
