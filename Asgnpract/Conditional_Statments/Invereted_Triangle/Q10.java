package Asgnpract.Conditional_Statments.Invereted_Triangle;

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows: ");
        int rows = sc.nextInt();

        for (int i = rows; i >= 1; i--) {

            int ascii = 65;
            char ch = 'A';

            for (int j = 1; j <= i; j++) {

                if (j % 2 != 0) {
                    System.out.print(ascii + " ");
                    ascii += 2;
                } else {
                    System.out.print(ch + " ");
                    ch += 2;
                }
            }

            System.out.println();
        }
    }
}