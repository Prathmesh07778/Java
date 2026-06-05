package Asgnpract.Conditional_Statments.Triangle_Pattern_2;

import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {

                if (j == 1) System.out.print(j + " ");

                else System.out.print((j - 1) * i + " ");

            }

            System.out.println();
        }
    }
}
