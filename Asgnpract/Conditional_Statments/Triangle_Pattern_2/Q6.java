package Asgnpract.Conditional_Statments.Triangle_Pattern_2;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            if (i % 2 == 1) System.out.print(i + " ");

            else {

                System.out.print((char)('A' + i - 2) + " ");

                for (int j = i - 1; j >= 1; j--) {

                    if (j % 2 == 1) System.out.print(j + " ");

                    else System.out.print((char)('A' + j - 2) + " ");

                }
            }

            System.out.println();
        }
    }
}
