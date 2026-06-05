package Asgnpract.Conditional_Statments.Triangle_Pattern_2;

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {

                if (j == 1) System.out.print(i * j + " ");

                else if (j % 2 == 0) System.out.print((char)('a' + j - 2) + " ");

                else System.out.print(i * j + " ");

            }

            System.out.println();
        }
    }
}
