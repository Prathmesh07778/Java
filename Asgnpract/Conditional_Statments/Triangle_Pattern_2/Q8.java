package Asgnpract.Conditional_Statments.Triangle_Pattern_2;

import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            System.out.print(i + " ");

            for (int j = 0; j < i - 1; j++) {

                System.out.print((char)('A' + j) + " ");

            }

            System.out.println();
        }
    }
}
