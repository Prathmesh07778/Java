package Asgnpract.Conditional_Statments.Triangle_Pattern_2;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            if (i % 2 == 1) {

                // number row

                for (int j = 1; j <= i; j++) System.out.print(j + " ");

            } else {

                // alphabet row

                for (int j = 0; j < i; j++) System.out.print((char)('A' + j) + " ");

            }

            System.out.println();
        }
    }
}