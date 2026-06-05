package Asgnpract.Conditional_Statments.Invereted_Triangle;

import java.util.Scanner;

public class Q5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = n; i >= 1; i--) {

            for (int j = 0; j < i; j++) {

                char c = (i % 2 == 1) ? (char)('A' + j) : (char)('a' + j);

                System.out.print(c + " ");

            }

            System.out.println();
        }
    }
}